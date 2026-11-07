package F7;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p151p.C1256n;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1256n f2451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f2452b;

    public k(FloatingActionButton floatingActionButton, C1256n c1256n) {
        this.f2452b = floatingActionButton;
        this.f2451a = c1256n;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && ((k) obj).f2451a.equals(this.f2451a);
    }

    public final int hashCode() {
        return this.f2451a.hashCode();
    }
}
