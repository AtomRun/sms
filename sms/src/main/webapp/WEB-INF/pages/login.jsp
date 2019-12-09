<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.4.1/core.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.slim.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.slim.min.js"></script>
<head>
    <%@include file="common/head.jsp" %>
    <%@include file="common/js.jsp" %>
</head>

<body>
<div class="page-wrapper flex-row align-items-center">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-5">
                <c:if test="${!empty message}">
                    <div class="alert alert-dismissible alert-danger">
                        ${message}
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                </c:if>

                <div class="card p-4">
                    <form id="loginForm" method="post" action="/manage/user/login.do">
                        <div class="card-header text-center text-uppercase h4 font-weight-light">
                            学生管理系统
                        </div>

                        <div class="card-body py-5">
                            <div class="form-group">
                                <label class="form-control-label">账号</label>
                                <input type="text" class="form-control" name="useraccount" id="useraccount">
                            </div>

                            <div class="form-group">
                                <label class="form-control-label">密码</label>
                                <input type="password" class="form-control" name="password" id="password">
                            </div>

                            <div class="custom-control custom-checkbox mt-4">
                                <input type="checkbox" class="custom-control-input" id="login">
                                <label class="custom-control-label" for="login">记住我</label>
                            </div>
                        </div>

                        <div class="card-footer">
                            <div class="row">
                                <div class="col-6">
                                    <button id="login_submit" class="btn btn-primary px-5">登录</button>
                                </div>

                                <div class="col-6">
                                    <a href="#" class="btn btn-link">忘记密码 ?</a>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
