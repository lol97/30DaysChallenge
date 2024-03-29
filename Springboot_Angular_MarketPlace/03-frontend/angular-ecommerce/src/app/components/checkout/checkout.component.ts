import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { AglisShopFormService } from 'src/app/services/aglis-shop-form.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  checkoutFormGroup!: FormGroup;

  totalPrice: number = 0;
  totalQuantity: number = 0;
  creditCardMoths: number[] = [];
  creditCardYears: number[] = [];

  constructor(  private formBuilder: FormBuilder,
      private aglisShopFormService: AglisShopFormService
    ) { }

  ngOnInit(): void {
    this.checkoutFormGroup = this.formBuilder.group({
      customer: this.formBuilder.group({
        firstName: [''],
        lastName: [''],
        email: ['']
      }),
      shippingAddress: this.formBuilder.group({
        street: [''],
        city: [''],
        state: [''],
        country: [''],
        zipCode: ['']
      }),
      billingAddress: this.formBuilder.group({
        street: [''],
        city: [''],
        state: [''],
        country: [''],
        zipCode: ['']
      }),
      creditCard: this.formBuilder.group({
        cardType: [''],
        nameOnCard: [''],
        cardNumber: [''],
        securityCode: [''],
        expirationMonth: [''],
        expirationYear: ['']
      })
    });

    //populate credit card months
    const startMonth: number = new Date().getMonth() + 1;
    console.log("startMonth" + startMonth);

    this.aglisShopFormService.getCreditCardMonths(startMonth).subscribe(
      data => {
        console.log("retrieve credit card months: " + JSON.stringify(data));
        this.creditCardMoths = data;
      }
    );

    //populate credit card years
    this.aglisShopFormService.getCreditCardYears().subscribe(
      data => {
        console.log("retrieve credit card years: " + JSON.stringify(data));
        this.creditCardYears = data;
      }
    );
  }

  copyShippingAddressToBillingAddress(event : any) {

    if (event.target.checked) {
      this.checkoutFormGroup.controls.billingAddress
            .setValue(this.checkoutFormGroup.controls.shippingAddress.value);
    }
    else {
      this.checkoutFormGroup.controls.billingAddress.reset();
    }
    
  }

  onSubmit() {
    console.log("handling submit");
    console.log(this.checkoutFormGroup?.get('customer')?.value);
    console.log('email->' + this.checkoutFormGroup?.get('customer')?.value.email + '......');
  }

}
