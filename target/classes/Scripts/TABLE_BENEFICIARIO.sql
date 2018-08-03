create table BENEFICIARIOS
(
  codigo    NUMBER(10) not null,
  nome      VARCHAR2(50) not null,
  descricao VARCHAR2(50),
  valor     VARCHAR2(50)
)
tablespace SYSTEM
  pctfree 10
  pctused 40
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
