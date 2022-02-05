import {Routes} from '@angular/router';
import { LoginRegisterComponent } from './app/login-register/login-register.component';
import { CreateQuizComponent } from './app/create-quiz/create-quiz.component';
import { TakeQuizComponent } from './app/take-quiz/take-quiz.component';
import { LeaderboardComponent } from './app/leaderboard/leaderboard.component';
import { LogoutComponent } from './app/logout/logout.component';
import { ProfileComponent } from './app/profile/profile.component';
import { ResultComponent } from './app/result/result.component';


export const appRoutes : Routes = [

    {path: '', redirectTo: '/login-register', pathMatch: 'full'},
    {path: 'login-register', component: LoginRegisterComponent},
    {path: 'profile', component: ProfileComponent},
    {path: 'create-quiz', component: CreateQuizComponent},
    {path: 'take-quiz', component:TakeQuizComponent},
    {path: 'leaderboard', component:LeaderboardComponent},
    {path: 'logout', component:LogoutComponent},
    {path: 'result', component:ResultComponent}

];