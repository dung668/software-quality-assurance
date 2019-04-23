<%--
  Created by IntelliJ IDEA.
  User: Dung
  Date: 4/21/2019
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Danh sách thuế</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet"/>
    <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet"/>
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
</head>
<body>


<div id="wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="adjust-nav">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <img src="assets/img/logo.png"/>
                </a>
            </div>

            <span class="logout-spn">
                  <a href="#" style="color:#fff;">LOGOUT</a>

                </span>
        </div>
    </div>
    <!-- /. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <a href="list-taxes"><i class="fa fa-bar-chart-o"></i>Danh sách thuế</a>
                </li>

                <li class="active-link">
                    <a href="tax-config"><i class="fa fa-edit"></i>Cấu hình thuế </a>
                </li>
            </ul>
        </div>

    </nav>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h2 class="text-center">DANH SÁCH THUẾ</h2>
                </div>
            </div>
            <!-- /. ROW  -->
            <hr/>

            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                        <tr>
                            <th rowspan="2">#</th>
                            <th rowspan="2">Họ tên</th>
                            <th rowspan="2">Chức vự</th>
                            <th rowspan="2">MST</th>
                            <th rowspan="2">Lương</th>
                            <th colspan="4" class="text-center">Khoản giảm trừ</th>
                            <th rowspan="2">Thuế phải nộp</th>
                        </tr>
                        <tr>
                            <th>Bản thân</th>
                            <th>Tiền ăn</th>
                            <th>Người PT</th>
                            <th>Giảm trừ PT</th>

                        </tr>
                        </thead>
                        <tbody>
                        ${userTaxes.size()}
                        <c:set var="count" value="1" scope="page"></c:set>
                        <c:forEach items="${userTaxes}" var="ut">
                            <tr>
                                <td>${count }</td>
                                <td>${ut.hoTen}</td>
                                <td>${ut.chucVu}</td>
                                <td>${ut.mst}</td>
                                <td>${ut.luong}</td>
                                <td>${ut.giamTruBanThan}</td>
                                <td>${ut.tienAn}</td>
                                <td>${ut.soNguoiPhuThuoc}</td>
                                <td>${ut.giamTruPhuThuoc}</td>
                                <td>${ut.thuePhaiNop}</td>
                            </tr>
                            <c:set var="count" value="${count + 1}" scope="page"></c:set>
                        </c:forEach>

                        </tbody>
                    </table>

                </div>
            </div>

            <div class="row">
                <div class="col-md-12 text-center">
                    <button type="button" class="btn btn-primary">Xuất báo cáo</button>
                    <button type="button" class="btn btn-warning">3 người nộp thuế cao nhất</button>
                </div>
            </div>

            <!-- /. ROW  -->
        </div>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>
<div class="footer">


    <div class="row">
        <div class="col-lg-12">
            &copy; 2014 yourdomain.com | Design by: <a href="http://binarytheme.com" style="color:#fff;"
                                                       target="_blank">www.binarytheme.com</a>
        </div>
    </div>
</div>


<!-- /. WRAPPER  -->
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script src="assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="assets/js/bootstrap.min.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="assets/js/custom.js"></script>

<!-- Tooltip -->
<script>
    $(document).ready(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });
</script>

</body>
</html>
