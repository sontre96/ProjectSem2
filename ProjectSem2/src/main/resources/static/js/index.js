
// Automatic Slideshow - change slide show 4s
var slideIndex = 1;

showSlides(slideIndex);
function plusSlides(n) {
    n = n || 1
    showSlides(slideIndex += n);
}

function currentSlide(n) {
    showSlides(slideIndex = n);
}

var activeTimer;
function showSlides(n) {
    if (activeTimer) window.clearTimeout(activeTimer);
    var i;
    var slides = $$('.slide-show');
    var lines = $$('.slide__line');
    if (n > slides.length) {slideIndex = 1}
    if (n < 1) {slideIndex = slides.length}
    for (i=0; i < slides.length; i++) {
        slides[i].style.display = 'none';
    }
    for (i = 0; i < lines.length; i++) {
        lines[i].className = lines[i].className.replace(' active', "");
    }
    slides[slideIndex-1].style.display = "block";
    lines[slideIndex-1].className += " active";
    activeTimer = window.setTimeout(plusSlides, 4000);
};


// Validate form
