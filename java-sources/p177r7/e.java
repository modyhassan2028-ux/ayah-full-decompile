package p177r7;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f21585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f21586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f21587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f21588u;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f21588u = bottomAppBar;
        this.f21585r = actionMenuView;
        this.f21586s = i10;
        this.f21587t = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21586s;
        boolean z10 = this.f21587t;
        BottomAppBar bottomAppBar = this.f21588u;
        ActionMenuView actionMenuView = this.f21585r;
        actionMenuView.setTranslationX(bottomAppBar.D(actionMenuView, i10, z10));
    }
}
