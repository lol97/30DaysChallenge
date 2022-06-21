import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from 'src/app/common/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list-grid.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];
  currentCategoryId: number = 1;
  previousCategoryId: number = 1;
  currentCategoryName!: string;
  searchMode!: boolean;

  //property for pagination
  thePageNumber: number = 1;
  thePageSize: number = 10;
  theTotalElements: number = 0;

  constructor(private productService: ProductService,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(() => {
      this.listProducts();
    });
  }

  listProducts() {
    this.searchMode = this.route.snapshot.paramMap.has("keyword");

    if (this.searchMode) {
      this.handleSearchProduct();
    } else {
      this.handleListProduct();
    }
  }

  handleSearchProduct() {
    const theKeyword: string = this.route.snapshot.paramMap.get("keyword")!;

    //search for the product
    this.productService.searchproducts(theKeyword).subscribe(
      data => {
        this.products = data;
      }
    );
  }

  handleListProduct() {
    // check if "id" parameter is available
    const hasCategoryId: boolean = this.route.snapshot.paramMap.has("id");

    if (hasCategoryId) {
      // convert the "id" param string. convert to number
      this.currentCategoryId = +this.route.snapshot.paramMap.get("id")!;

      // get "name" category from url
      this.currentCategoryName = this.route.snapshot.paramMap.get("name")!;
    } else {
      // not category id available ... default to category id 1
      this.currentCategoryId = 1;
      this.currentCategoryName = 'Books';
    }


    /*
    * check if we have different category than previous,
    * if different reset thePageNumber to 1;
    */
    if (this.currentCategoryId != this.previousCategoryId) {
      this.thePageNumber = 1;
    }
    this.previousCategoryId = this.currentCategoryId;

    this.productService.getProductListPaginate(this.thePageNumber - 1,
      this.thePageSize,
      this.currentCategoryId).subscribe(
        data => {
          this.products = data._embedded.products;
          this.thePageNumber = data.page.number + 1;
          this.thePageSize = data.page.size;
          this.theTotalElements = data.page.totalElements;
        }
      );
  }

  // processResult() {
  //   data => {
  //     this.products = data._embedded.products;
  //     this.thePageNumber = data.page.number + 1;
  //     this.thePageSize = data.page.size;
  //     this.theTotalElements = data.page.totalElements;
  //   };
  // }

}
