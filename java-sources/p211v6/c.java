package p211v6;

import android.view.View;
import com.ayah.MainActivity;
import p035d3.z;
import p130n.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f23345t;

    public c(MainActivity mainActivity, z zVar, View view) {
        this.f19724r = true;
        this.f19725s = zVar;
        view = view == null ? mainActivity.getWindow().getDecorView() : view;
        this.f23345t = view;
        view.setOnSystemUiVisibilityChangeListener(this);
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        if ((i10 & 1) != 0) {
            p();
        } else {
            r();
        }
    }

    public abstract void p();

    public abstract void r();
}
