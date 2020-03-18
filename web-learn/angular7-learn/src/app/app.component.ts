import {Component, NgModule, OnInit} from '@angular/core';
import {UserService} from "./user/user.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular7-learn';
  content="tsfsaf";

  Construtor(userService:UserService){
    this.content= userService.getContent();
  }

}
