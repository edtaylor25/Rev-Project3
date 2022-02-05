import { Injectable } from '@angular/core';
import { User } from './user.model';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLoggedIn: boolean | undefined;

  retrieveUser() {
    var data: any = sessionStorage.getItem("userData");
    return JSON.parse(data == User?'':data);
    }
  }
