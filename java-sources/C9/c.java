package C9;

import java.util.Random;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f784t = new b(0);

    @Override // C9.a
    public final Random a() {
        Object obj = this.f784t.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
