package D9;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C9.a {
    @Override // C9.a
    public final Random a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        j.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
