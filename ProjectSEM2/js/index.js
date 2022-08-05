const $ = document.querySelector.bind(document)
const $$ = document.querySelectorAll.bind(document)

//  header navbar
const navs = $$('.header__navbar-item');
const navAcite = $('.header__navbar-item.active1')
const line = $('.header__navbar-line')

line.style.left = navAcite.offsetLeft + 'px'
line.style.width = navAcite.offsetWidth + 'px'

navs.forEach((nav, index) => {
    nav.onclick = function() {
        
        $('.header__navbar-item.active1').classList.remove('active1')

        line.style.left = this.offsetLeft + 'px'
        line.style.width = this.offsetWidth + 'px'

        this.classList.add('active1');
    }
});


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

// Mobile menu
const navbarToggle = document.querySelector("#navbar-toggle");
const navbarMenu = document.querySelector("#navbar-menu");
const navbarLinksContainer = navbarMenu.querySelector(".header__navbar-list");
let isNavbarExpanded = navbarToggle.getAttribute("aria-expanded") === "true";

const toggleNavbarVisibility = () => {
  isNavbarExpanded = !isNavbarExpanded;
  navbarToggle.setAttribute("aria-expanded", isNavbarExpanded);
};

navbarToggle.addEventListener("click", toggleNavbarVisibility);

navbarLinksContainer.addEventListener("click", (e) => e.stopPropagation());
navbarMenu.addEventListener("click", toggleNavbarVisibility);




// Validate form
