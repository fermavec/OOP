<?php
require_once('./account.php');

class AccountDriver extends Account{
  public function __construct($name, $document, $email, $password){
    parent::__construct($name, $document);
    $this->email = $email;
    $this->password = $password;
  }
}
?>