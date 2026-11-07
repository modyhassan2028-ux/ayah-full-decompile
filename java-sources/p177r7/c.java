package p177r7;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f21579c;

    public c(BottomAppBar bottomAppBar, int i10) {
        this.f21579c = bottomAppBar;
        this.f21578b = i10;
    }

    @Override // p000a.a
    public final void V(FloatingActionButton floatingActionButton) {
        int i10 = BottomAppBar.f14616M0;
        floatingActionButton.setTranslationX(this.f21579c.E(this.f21578b));
        floatingActionButton.l(new b(), true);
    }
}
