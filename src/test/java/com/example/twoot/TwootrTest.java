package com.example.twoot;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TwootrTest {

  private Twootr twootr;
  private SenderEndPoint senderEndPoint;

  private ReceiverEndPoint receiverEndPoint;



  @Test
  void shouldBeAbleToAuthenticateUser() {
    logon();
  }

  @Test
  void shouldNotAuthenticateUserWithWrongPassword() {

    Optional<SenderEndPoint> bad = twootr.onLogon(TestData.USER_ID, "bad", receiverEndPoint);

    Assertions.assertThat(bad.isPresent()).isFalse();

  }

  private void logon() {
    this.senderEndPoint = logon(TestData.USER_ID, receiverEndPoint);
  }


  private SenderEndPoint logon(final String userId, final ReceiverEndPoint receiverEndPoint) {

    Optional<SenderEndPoint> senderEndPoint1 = twootr.onLogon(userId, "kkkk", receiverEndPoint);

    Assertions.assertThat(senderEndPoint1.isPresent()).isTrue();

    return senderEndPoint1.get();

  }

}