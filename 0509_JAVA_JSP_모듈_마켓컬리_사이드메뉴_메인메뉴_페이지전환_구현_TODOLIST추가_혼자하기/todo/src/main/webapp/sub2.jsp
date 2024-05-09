<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main id ="sub2" class="main">
	<div class="todo-title">
		<h1>My ToDo List &nbsp;(<strong class='tot'></strong>)</h1>
	</div>
	<!-- 할일추가하는 입력폼 -->
	<form class="todo-form">
		<div>
			<input type='text' name='todoInput' id='todoInput' placeholder='할일 입력해주세요.' />
			<button class="save-btn"><i class="material-icons">playlist_add</i></button>
		</div>
	</form>
	<!-- 할일리스트목록 -->
	<div class="todo-box">
		<h2>Task <span class='cnt1'></span></h2>
		<ul class="todo-list">
			<!-- 진행중 할일 목록 바인딩 위치 -->
		</ul>
	</div>
	<!-- 할일리스트목록 중 완료[체크]한 목록 -->
	<div class="todo-box">
		<h2>Done <span class='cnt2'></span></h2>
		<ul class="todo-done-list">
			<!-- 완료된 할일 목록 바인딩 위치 -->
		</ul>
	</div>
</main>