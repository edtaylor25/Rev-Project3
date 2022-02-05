import { Directive, ElementRef, HostListener, Input, Renderer2 } from "@angular/core";

@Directive({
    selector: '[appBackground]'
})

export class BackgroundDirective {
   @Input() correctAnswer:boolean = false;
    constructor(private elementRef: ElementRef, private renderer: Renderer2){}
    @HostListener('click') onAnswered(){
        if(this.correctAnswer)
        this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'green');
        else
        this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'red');

    }
}