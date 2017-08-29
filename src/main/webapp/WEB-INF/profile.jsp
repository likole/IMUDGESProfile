<%--
  Created by IntelliJ IDEA.
  User: likole
  Date: 8/29/17
  Time: 5:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
    <meta charset="utf-8" />
    <title>Metronic | User Profile 2</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
    <link href="../assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
    <link href="../assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <link href="../assets/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css" rel="stylesheet" type="text/css" />
    <link href="../assets/global/plugins/bootstrap-select/css/bootstrap-select.min.css" rel="stylesheet" type="text/css">
    <!-- END PAGE LEVEL PLUGINS -->
    <!-- BEGIN THEME GLOBAL STYLES -->
    <link href="../assets/global/css/components-md.min.css" rel="stylesheet" id="style_components" type="text/css" />
    <link href="../assets/global/css/plugins-md.min.css" rel="stylesheet" type="text/css" />
    <!-- END THEME GLOBAL STYLES -->
    <!-- BEGIN PAGE LEVEL STYLES -->
    <link href="../assets/pages/css/profile-2.min.css" rel="stylesheet" type="text/css" />
    <!-- END PAGE LEVEL STYLES -->
    <!-- BEGIN THEME LAYOUT STYLES -->
    <link href="../assets/layouts/layout/css/layout.min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/layouts/layout/css/themes/darkblue.min.css" rel="stylesheet" type="text/css" id="style_color" />
    <link href="../assets/layouts/layout/css/custom.min.css" rel="stylesheet" type="text/css" />
    <!-- END THEME LAYOUT STYLES -->
    <link rel="shortcut icon" href="favicon.ico" /> </head>
<!-- END HEAD -->

<body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white page-md">
<!-- BEGIN CONTENT -->
<div class="page-content-wrapper">
    <!-- BEGIN CONTENT BODY -->
    <div class="page-content">
        <!-- BEGIN PAGE HEADER-->
        <!-- BEGIN PAGE BAR -->
        <div class="page-bar">
            <h2>IMUDGES</h2>
        </div>
        <!-- END PAGE BAR -->
        <!-- BEGIN PAGE TITLE-->
        <h3 class="page-title"> 个人信息管理
        </h3>
        <!-- END PAGE TITLE-->
        <!-- END PAGE HEADER-->
        <div class="profile">
            <div class="tabbable-line tabbable-full-width">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#tab_1_1" data-toggle="tab"> 总览 </a>
                    </li>
                    <li>
                        <a href="#tab_1_3" data-toggle="tab"> 编辑 </a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="tab_1_1">
                        <div class="row">
                            <div class="col-md-3">
                                <ul class="list-unstyled profile-nav">
                                    <li>
                                        <img src="../assets/pages/media/profile/people19.png" class="img-responsive pic-bordered" alt="" />
                                    </li>
                                </ul>
                            </div>
                            <div class="col-md-9">
                                <div class="row">
                                    <div class="col-md-9 profile-info">
                                        <h1 class="font-green sbold uppercase"><s:property value="info.name"/></h1>
                                        <p> <s:property value="member.description"/>
                                        </p>
                                        <p>
                                            <a href="javascript:;"><s:property value="member.homepage"/> </a>
                                        </p>
                                        <ul class="list-inline">
                                            <li>
                                                <i class="fa fa-venus-mars"></i>
                                                <s:if test="info.gender==1">男</s:if><s:else>女</s:else>
                                            </li>
                                            <li>
                                                <i class="fa fa-users"></i>
                                                <s:if test="member.gid==1">前端组</s:if>
                                                <s:elseif test="member.gid==2">后端组</s:elseif>
                                                <s:elseif test="member.gid==3">移动开发组</s:elseif>
                                                <s:elseif test="member.gid==4">游戏组</s:elseif>
                                                <s:elseif test="member.gid==5">创新交互组</s:elseif>
                                                <s:elseif test="member.gid==6">机器学习组</s:elseif>
                                            </li>
                                            <li>
                                                <i class="fa fa-calendar"></i> <s:property value="birthday"/> </li>
                                            <li>
                                                <i class="fa fa-github"></i> <s:property value="member.github" default="无github"/> </li>
                                            <li>
                                                <i class="fa fa-qq"></i> <s:property value="member.qq" default="无QQ"/> </li>
                                            <li>
                                                <i class="fa fa-briefcase"></i> <s:property value="info.bj"/> </li>

                                        </ul>
                                    </div>
                                    <!--end col-md-8-->
                                    <div class="col-md-3">
                                    </div>
                                    <!--end col-md-4-->
                                </div>
                                <!--end row-->
                            </div>
                        </div>
                    </div>
                    <!--tab_1_2-->
                    <div class="tab-pane" id="tab_1_3">
                        <div class="row profile-account">
                            <div class="col-md-3">
                                <ul class="ver-inline-menu tabbable margin-bottom-10">
                                    <li class="active">
                                        <a data-toggle="tab" href="#tab_1-1">
                                            <i class="fa fa-cog"></i> 个人信息 </a>
                                        <span class="after"> </span>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" href="#tab_2-2">
                                            <i class="fa fa-picture-o"></i> 更改头像 </a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" href="#tab_3-3">
                                            <i class="fa fa-lock"></i> 修改密码 </a>
                                    </li>
                                </ul>
                            </div>
                            <div class="col-md-9">
                                <div class="tab-content">
                                    <div id="tab_1-1" class="tab-pane active">
                                        <form role="form" action="changeInfo" method="post">
                                            <div class="form-group">
                                                <label class="control-label">个人网站</label>
                                                <input type="text" placeholder="<s:property value="member.homepage"/>" name="homepage" class="form-control" value="<s:property value="member.homepage"/>" /> </div>
                                            <div class="form-group">
                                                <label class="control-label">Github</label>
                                                <input type="text" placeholder="<s:property value="member.github"/>" name="github" value="<s:property value="member.github"/>" class="form-control" /> </div>
                                            <div class="form-group">
                                                <label class="control-label">QQ</label>
                                                <input type="text" placeholder="<s:property value="member.qq"/>"  name="qq" class="form-control" value="<s:property value="member.qq"/>"/> </div>
                                            <div class="form-group">
                                                <label class="control-label">组别</label>
                                                <select class="bs-select form-control" name="gid">
                                                    <option value="1" <s:if test="member.gid==1">selected</s:if> >前端组</option>
                                                    <option value="2" <s:if test="member.gid==2">selected</s:if> >后端组</option>
                                                    <option value="3" <s:if test="member.gid==3">selected</s:if> >移动开发组</option>
                                                    <option value="4" <s:if test="member.gid==4">selected</s:if> >游戏组</option>
                                                    <option value="5" <s:if test="member.gid==5">selected</s:if> >创新交互组</option>
                                                    <option value="6" <s:if test="member.gid==6">selected</s:if> >机器学习组</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label">个人介绍</label>
                                                <textarea class="form-control" rows="3" placeholder="<s:property value="member.description"/>" name="description"><s:property value="member.description"/></textarea>
                                            </div>
                                            <div class="margiv-top-10">
                                                <input type="submit" class="btn green" value="修改"/>
                                                <input type="reset" class="btn default" value="重置"/>
                                            </div>
                                        </form>
                                    </div>
                                    <div id="tab_2-2" class="tab-pane">
                                        <form action="changeAvatar" role="form">
                                            <div class="form-group">
                                                <div class="fileinput fileinput-new" data-provides="fileinput">
                                                    <div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
                                                        <img src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt="" /> </div>
                                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"> </div>
                                                    <div>
                                                                    <span class="btn default btn-file">
                                                                        <span class="fileinput-new"> 选择图片 </span>
                                                                        <span class="fileinput-exists"> 更改 </span>
                                                                        <input type="file" name="avatar"> </span>
                                                        <a href="javascript:;" class="btn default fileinput-exists" data-dismiss="fileinput"> 移除 </a>
                                                    </div>
                                                </div>
                                                <div class="clearfix margin-top-10">
                                                    <span class="label label-danger"> 图片预览不支持IE9及以下 </span>
                                                </div>
                                            </div>
                                            <div class="margin-top-10">
                                                <a href="javascript:;" class="btn green"> 提交 </a>
                                            </div>
                                        </form>
                                    </div>
                                    <div id="tab_3-3" class="tab-pane">
                                        <form action="changePassword">
                                            <div class="form-group">
                                                <label class="control-label">原密码</label>
                                                <input type="password" class="form-control" name="password"/> </div>
                                            <div class="form-group">
                                                <label class="control-label">新密码</label>
                                                <input type="password" class="form-control" name="password_new"/> </div>
                                            <div class="form-group">
                                                <label class="control-label">确认密码</label>
                                                <input type="password" class="form-control" /> </div>
                                            <div class="margin-top-10">
                                                <a href="javascript:;" class="btn green"> 修改密码 </a>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <!--end col-md-9-->
                        </div>
                    </div>
                    <!--end tab-pane-->
                </div>
            </div>
        </div>
    </div>
    <!-- END CONTENT BODY -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="page-footer">
    <div class="page-footer-inner"> Copyright &copy; IMUDGES 2017</div>
    <div class="scroll-to-top">
        <i class="icon-arrow-up"></i>
    </div>
</div>
<!-- END FOOTER -->
<!--[if lt IE 9]>
<script src="../assets/global/plugins/respond.min.js"></script>
<script src="../assets/global/plugins/excanvas.min.js"></script>
<![endif]-->
<!-- BEGIN CORE PLUGINS -->
<script src="../assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="../assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="../assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="../assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="../assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="../assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="../assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="../assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="../assets/global/plugins/bootstrap-fileinput/bootstrap-fileinput.js" type="text/javascript"></script>
<script src="../assets/global/plugins/gmaps/gmaps.min.js" type="text/javascript"></script><script src="../assets/pages/scripts/components-bootstrap-select.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="../assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script src="../assets/layouts/layout/scripts/layout.min.js" type="text/javascript"></script>
<script src="../assets/layouts/layout/scripts/demo.min.js" type="text/javascript"></script>
<script src="../assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>