import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { UserService } from './user/user.service';
import { ProductDetailsComponent } from './product-details/product-details.component';
import {RouterModule} from "@angular/router";
import { ProductListComponent } from './product-list/product-list.component';
import {ReactiveFormsModule} from "@angular/forms";
import { AppTopBarComponent } from './app-top-bar/app-top-bar.component';
import { ProductAlertComponent } from './product-alert/product-alert.component';
import { CartComponent } from './cart/cart.component';
import { ShippingComponent } from './shipping/shipping.component';
@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    AppTopBarComponent,
    ProductDetailsComponent,
    ProductListComponent,
    AppTopBarComponent,
    ProductAlertComponent,
    CartComponent,
    ShippingComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path: '', component: ProductListComponent },
      { path: 'products/:productId', component: ProductDetailsComponent },
      { path: 'cart', component: CartComponent },
      { path: 'shipping', component: ShippingComponent },
    ])
  ],
  providers: [ UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
