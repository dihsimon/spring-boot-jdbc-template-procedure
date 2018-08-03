CREATE OR REPLACE PACKAGE BODY PKG_BENEF AS

   PROCEDURE BUSCAR_BENEFICIARIO (retorno_beneficiario OUT SYS_REFCURSOR) IS
   BEGIN
     open retorno_beneficiario for
          SELECT * FROM beneficiarios;
   END;
END PKG_BENEF;
