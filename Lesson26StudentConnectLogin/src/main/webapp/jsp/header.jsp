<%--
  Created by IntelliJ IDEA.
  User: Виктор
  Date: 18/02/2023
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="u-clearfix u-header u-header" id="sec-52ce">
    <div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <a class="u-hover-feature u-image u-logo u-opacity u-opacity-75 u-image-1" data-image-height="3588"
           data-image-width="5382" href="/" title="index">
            <img class="u-logo-image u-logo-image-1"
                 src="https://i.ibb.co/cxrCxyQ/pngegg.png">
        </a>
        <nav class="u-menu u-menu-one-level u-offcanvas u-menu-1">
            <div class="menu-collapse"
                 style="font-size: 1rem; letter-spacing: 0px; text-transform: uppercase; font-weight: 500;">
                <a class="u-button-style u-custom-active-border-color u-custom-active-color u-custom-border u-custom-border-color u-custom-borders u-custom-hover-border-color u-custom-hover-color u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-text-color u-custom-text-decoration u-custom-text-hover-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                   href="#">
                    <svg class="u-svg-link" viewBox="0 0 24 24">
                        <use xlink:href="#menu-hamburger"></use>
                    </svg>
                    <svg class="u-svg-content" id="menu-hamburger" version="1.1" viewBox="0 0 16 16" x="0px"
                         xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" y="0px">
                        <g>
                            <rect height="2" width="16" y="1"></rect>
                            <rect height="2" width="16" y="7"></rect>
                            <rect height="2" width="16" y="13"></rect>
                        </g>
                    </svg>
                </a>
            </div>
            <div class="u-custom-menu u-nav-container">
                <ul class="u-nav u-spacing-2 u-unstyled u-nav-1">
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="/add-student" style="padding: 10px 20px;">Create</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="/get-students" style="padding: 10px 20px;">Read Update Delete</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="/delete-student" style="padding: 10px 20px;">Delete по ID</a>
                    </li>
                    <%--                    <li class="u-nav-item"><a--%>
                    <%--                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"--%>
                    <%--                            href="/delete-student" style="padding: 10px 20px;">Delete</a>--%>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="/logout"
                            style="padding: 10px 20px;">Logout</a>
                    </li>
                </ul>
            </div>
            <div class="u-custom-menu u-nav-container-collapse">
                <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                    <div class="u-inner-container-layout u-sidenav-overflow">
                        <div class="u-menu-close"></div>
                        <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2">
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="/add-student">Create</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="/get-students">Read</a>
                            </li>
                            <%--                            <li class="u-nav-item"><a class="u-button-style u-nav-link"--%>
                            <%--                                                      href="/update-student">Update</a>--%>
                            <%--                            </li>--%>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="/delete-student">Delete</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="/logout">Logout</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
            </div>
        </nav>
    </div>
</header>
