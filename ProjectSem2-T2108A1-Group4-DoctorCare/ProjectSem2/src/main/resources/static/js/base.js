const $ = document.querySelector.bind(document)
const $$ = document.querySelectorAll.bind(document)

//  header navbar
const navs = $$('.header__navbar-item');
const navActive = $('.header__navbar-item.active1')
const line = $('.header__navbar-line')

line.style.left = navActive.offsetLeft + 'px'
line.style.width = navActive.offsetWidth + 'px'

navs.forEach((nav, index) => {
    nav.onclick = function() {
        
        $('.header__navbar-item.active1').classList.remove('active1')

        line.style.left = this.offsetLeft + 'px'
        line.style.width = this.offsetWidth + 'px'

        this.classList.add('active1');
    }
});


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

