import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list-bootstrap.component.html',
  styleUrls: ['./sales-person-list.component.css']
})

export class SalesPersonListComponent implements OnInit {

  // create an array of objects
  salesPersonList: SalesPerson[] = [
    new SalesPerson("Ruby", "Permata", "ruby@aglis.com", 10000000),
    new SalesPerson("Ariawan", "", "awan@aglis.com", 20000000),
    new SalesPerson("Veny", "Siahaan", "veny@aglis.com", 5000000)
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
