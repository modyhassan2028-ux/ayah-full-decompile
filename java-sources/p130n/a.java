package p130n;

import android.view.MenuInflater;
import android.view.View;
import com.ayah.MainActivity;
import p035d3.z;
import p140o.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f19725s;

    public abstract void a();

    public abstract View b();

    public abstract k c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract void g();

    public abstract boolean h();

    public abstract void i(View view);

    public void j(boolean z10) {
        this.f19724r = z10;
        MainActivity mainActivity = ((z) this.f19725s).f15689r;
        int i10 = MainActivity.f13622J0;
        mainActivity.z(z10);
    }

    public abstract void k(int i10);

    public abstract void l(CharSequence charSequence);

    public abstract void m(int i10);

    public abstract void n(CharSequence charSequence);

    public abstract void o(boolean z10);
}
