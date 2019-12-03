import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {  HttpClientModule } from '@angular/common/http';
import { RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { RequirmentformComponent } from './requirmentform/requirmentform.component';
import { HomeComponent } from './home/home.component';
import { UpdateRequirmentComponent } from './update-requirment/update-requirment.component';

@NgModule({
  declarations: [
    AppComponent,
    RequirmentformComponent,
    HomeComponent,
    UpdateRequirmentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : "", component:HomeComponent},
      {path : "form",component: RequirmentformComponent},
      {path : "update", component: UpdateRequirmentComponent}
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
