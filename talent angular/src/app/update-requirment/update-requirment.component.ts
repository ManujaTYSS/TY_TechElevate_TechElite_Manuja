import { Component, OnInit } from '@angular/core';
import { RequirmentService } from '../requirment.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-requirment',
  templateUrl: './update-requirment.component.html',
  styleUrls: ['./update-requirment.component.css']
})
export class UpdateRequirmentComponent implements OnInit {
req:any[];
  constructor(private requirmentservice:RequirmentService,private router:Router) { 
    this.getDataFromBd();
  }
  getDataFromBd() {
    this.requirmentservice.getRequirment().subscribe(data=>{
      console.log(data);
       this.req=data.add;
       console.log(this.req);
     }, err => {
       console.log(err);
     } , () => {
       console.log('Got The data')
     })
  }
  ngOnInit() {
  }

}
