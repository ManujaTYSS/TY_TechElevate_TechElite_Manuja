import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RequirmentService } from '../requirment.service';


@Component({
  selector: 'app-requirmentform',
  templateUrl: './requirmentform.component.html',
  styleUrls: ['./requirmentform.component.css']
})
export class RequirmentformComponent implements OnInit {

  constructor(private requirmentservice: RequirmentService, private router:Router) { }
  addRequirments(addRequirment){
    this.requirmentservice.addRequirment(addRequirment.value).subscribe(res => {
      console.log('requirment added successfully');
      alert('requirment Added Successfully...!')
      addRequirment.reset();
   }, err => {
      console.log('Requirment is  not added');
   });
    
  }
  ngOnInit() {
  }

}
