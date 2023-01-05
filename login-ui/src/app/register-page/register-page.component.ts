import { Component, OnInit } from '@angular/core';

import { RegisterService } from '../register.service';

import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styleUrls: ['./register-page.component.css']
})
export class RegisterPageComponent {

  registerFailed = false;

  constructor (
    private registerService: RegisterService,
    private router: Router
  ) {  }

  // returns true when register failed
  registerAttempt(username: string, password: string): boolean {
    if (this.registerService.registerAttempt(username, password)) {
      this.router.navigate(["home-page"]);
      return true;
    }
    return false;
  }

}
