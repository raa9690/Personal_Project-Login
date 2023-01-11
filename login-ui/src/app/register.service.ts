import { Injectable } from '@angular/core';
import { USERS } from './mock-users-info';
import { UserInfo } from './user-info';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  users = USERS

  constructor() { }

  public allowedPassword(new_password: string): boolean {
    // setting up conditions for a password to not be allowed
    if(new_password.length < 3) {
      return false;
    }
    return true;
  }

  // Temp UI side 
  public registerAttempt(new_username: string, new_password: string){
    for (let user of this.users) {
      if (new_username == user.username){
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
