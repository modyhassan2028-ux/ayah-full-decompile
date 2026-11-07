package io.realm.internal.objectstore;

import io.realm.mongodb.sync.SubscriptionSet$State;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class OsSubscriptionSet$1 implements OsSubscriptionSet$StateChangeCallback {
    final /* synthetic */ OsSubscriptionSet this$0;
    final /* synthetic */ CountDownLatch val$latch;
    final /* synthetic */ AtomicBoolean val$success;

    public OsSubscriptionSet$1(OsSubscriptionSet osSubscriptionSet, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        this.this$0 = osSubscriptionSet;
        this.val$success = atomicBoolean;
        this.val$latch = countDownLatch;
    }

    @Override // io.realm.internal.objectstore.OsSubscriptionSet$StateChangeCallback
    public void onChange(byte b5) {
        this.val$success.set(SubscriptionSet$State.fromNativeValue((long) b5) == SubscriptionSet$State.COMPLETE);
        this.val$latch.countDown();
    }
}
