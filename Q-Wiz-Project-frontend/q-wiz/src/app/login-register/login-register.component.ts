import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { User } from '../user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login-register',
  templateUrl: './login-register.component.html',
  styleUrls: ['./login-register.component.css']
})
export class LoginRegisterComponent implements OnInit {

  email = "";
  password = "";
  errorMsg="";

  testPerm = "";



  currentUser: User = {
    id: 0,
    userName:"",
    firstName: "",
    lastName: "",
    email: "test@test.com",
    password: "password",
  }
  constructor(private userService: UserService, private authService: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  performLogin() {
    this.userService.getLoggedIn(this.email, this.password).subscribe(
      
      (response) => {
        console.log(response);
        sessionStorage.setItem('userId', ""+response.id);
        this.authService.isLoggedIn = true;
        
      },
      (error) => {
          console.log(error);
          this.errorMsg= "ERROR!";
          console.log(this.errorMsg);
      }
    );
    

  }

}



