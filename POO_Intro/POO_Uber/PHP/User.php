<?php
require_once('./account.php');

class AccountUser extends Account{
  public function __construct($name, $document, $email, $password){
    parent::__construct($name, $document);
    $this->email = $email;
    $this->password = $password;
  }
}
?>