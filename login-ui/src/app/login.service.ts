import { Injectable } from '@angular/core';
import { USERS } from './mock-users-info';
import { UserInfo } from './user-info';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  users = USERS

  constructor() { }

  // Temp UI side functionality
  public loginAttempt(username: string, password: string): boolean{
    for (let user of this.users) {
      if (username == user.username && password == user.password){
        return true;
      }
    }
    return false
  }

  // Temp UI side 
  public registerAttempt(new_username: string, new_password: string){
    for (let user of this.users) {
      if (new_username == user.username && new_password == user.password){
        return false;
      }
    }

    this.users.push(
      {
        id: this.users.length, 
        username: new_username, 
        password: new_password
      }
    )
    return true;
  }
}
