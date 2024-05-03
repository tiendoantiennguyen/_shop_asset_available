<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>table pages</title>
</head>
<!-- Begin Page Content -->
     <div class="container-fluid">

         <!-- Page Heading -->
         <h1 class="h3 mb-2 text-gray-800">Category Management</h1>
         <p class="mb-4">Add new category, delete category, update category, change the information of category. <a target="_blank"
                 href="https://datatables.net">official DataTables documentation</a>.</p>
        
        
         <!-- Tim add new function add category -->     
         <div style="padding-right:500px;">
         	<a href = "/admin/categories/add"><i class="fas fa-plus fa-fw"></i></a>
         </div>          
         <!-- Tim add new function add category -->
         
         
         <!-- DataTales Example -->
         <div class="card shadow mb-4">
             <div class="card-header py-3">
                 <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>                
             </div>
             <div class="card-body">
                 <div class="table-responsive">
                     <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                         <thead>
                             <tr>
                                 <th>Poster</th>
                                 <th>Name</th>
                                 <th>Description</th>
                                 <th>Active</th>
                                 <th>Date Expired</th>
                                 <th>CRUD</th>
                             </tr>
                         </thead>
                         <tfoot>
                             <tr>
                                 <th>Poster</th>
                                 <th>Name</th>
                                 <th>Description</th>
                                 <th>Active</th>
                                 <th>Date Expired</th>
                                 <th>CRUD</th>
                             </tr>
                         </tfoot>
                         <tbody>
                             <tr>
                                 <td>Tiger Nixon</td>
                                 <td>System Architect</td>
                                 <td>Edinburgh</td>
                                 <td>61</td>
                                 <td>2011/04/25</td>
                                 <td>
                                 	<i class="fas fa-edit fa-fw"></i>
                                 	<i class="fas fa-trash fa-fw"></i> 
                                 	<i class="fas fa-edit fa-fw"></i>  
                                 </td>
                             </tr>                           
                         </tbody>
                     </table>
                 </div>
             </div>
         </div>

     </div>
     <!-- /.container-fluid -->
</html>