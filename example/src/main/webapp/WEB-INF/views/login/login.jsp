<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>



        <div class="container-fluid vh-100 overflow-auto">
            <div class="row vh-100 ">
                <div class="col-lg-6 bg-gray p-5 text-center">
                   <h4 class="text-center fw-bolder fs-2">Register</h4>
                   <p class="mb-3 fs-7">Register Now and Fell the New Digital World</p>
                   <a href="registerPage">
                       <button class="btn fw-bold mb-5 btn-outline-success px-4 rounded-pill">Sign Up</button>
                   </a>
                   <div class="img-cover p-4">
                        <img src="<c:url value='/template/login_logout/assets/images/loginbg.svg'/>" alt="">
                   </div>
                </div>
                <div class="col-lg-6 p  vh-100">
                   <div class="row d-flex vh-100">
                       <div class="col-md-8 p-4 ikigui m-auto text-center align-items-center">
                           <h4 class="text-center fw-bolder mb-4 fs-2">Login</h4>
                           <div class="input-group mb-4">
                              <span class="input-group-text border-end-0 inbg" id="basic-addon1"><i class="bi bi-person"></i></span>
                              <input type="text" class="form-control ps-2 border-start-0 fs-7 inbg form-control-lg mb-0" placeholder="Enter Username" aria-label="Username" aria-describedby="basic-addon1">
                           </div>
                           <div class="input-group mb-4">
                              <span class="input-group-text border-end-0 inbg" id="basic-addon1"><i class="bi bi-lock"></i></span>
                              <input type="password" class="form-control ps-2 fs-7 border-start-0 form-control-lg inbg mb-0" placeholder="Enter Password" aria-label="Username" aria-describedby="basic-addon1">
                           </div>
                           
                           <button class="btn btn-lg fw-bold fs-7 btn-success  w-100">Login</button>
                           
                           <p class="text-center py-4 fw-bold fs-8">Or Sign in with social platforms</p>
                           
                           <ul class="d-inline-block mx-auto">
                               <li class="float-start px-3"><a href=""><i class="bi bi-facebook"></i></a></li>
                               <li class="float-start px-3"><a href=""><i class="bi bi-twitter"></i></a></li>
                               <li class="float-start px-3"><a href=""><i class="bi bi-linkedin"></i></a></li>
                               <li class="float-start px-3"><a href=""><i class="bi bi-google"></i></a></li>
                               
                           </ul>
                       </div>
                   </div>
                    
                </div>
            </div>
        </div>  
  
