create schema if not exists kozuki_education;
use kozuki_education;

create table if not exists tb_alunos (
	Id_aluno int primary key auto_increment,
    Nome_aluno varchar(50),
    Email_aluno varchar(100),
    Curso_aluno varchar(50)
);