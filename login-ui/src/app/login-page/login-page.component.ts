import { Component, OnInit } from '@angular/core';

import { LoginService } from '../login.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent {

  // True at start so that the failed login message doesn't display until after a login attempt is made
  loginSuccess = true

  constructor(private loginService: LoginService) { }

  loginAttempt(username:string, password:string): boolean{
    return this.loginService.loginAttempt(username, password);
  }
}
