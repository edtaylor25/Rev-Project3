import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule , ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginRegisterComponent } from './login-register/login-register.component';
import { CreateQuizComponent } from './create-quiz/create-quiz.component';
import { CreateQuestionAnswerComponent } from './create-question-answer/create-question-answer.component';
import { NavbarComponent } from './navbar/navbar.component';
import { TakeQuizComponent} from 'src/app/take-quiz/take-quiz.component';
import { ResultComponent } from './result/result.component';
import { CreateTagsComponent } from './create-tags/create-tags.component';
import { FilterByTagsComponent } from './filter-by-tags/filter-by-tags.component';
import { LeaderboardComponent } from './leaderboard/leaderboard.component';
import { RouterModule } from '@angular/router';
import { appRoutes } from 'src/routes';
import { LogoutComponent } from './logout/logout.component';
import { ProfileComponent } from './profile/profile.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginRegisterComponent,
    CreateQuizComponent,
    CreateQuestionAnswerComponent,
    NavbarComponent,
    TakeQuizComponent,
    ResultComponent,
    CreateTagsComponent,
    FilterByTagsComponent,
    LeaderboardComponent,
    LogoutComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
