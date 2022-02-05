import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  baseUrl = "http://localhost:4040/api/user";

  constructor(private http: HttpClient) { }


  getLoggedIn(email: string, password: string): Observable<User>{
      return this.http.get<User>(this.baseUrl+"/login/"+email+"/"+password);
  }
}
