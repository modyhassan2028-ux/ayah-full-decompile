package p056f2;

import android.view.ViewGroup;
import p020c.C0776a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16038b;

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(ViewGroup viewGroup);

    public void c(C0776a c0776a, ViewGroup viewGroup) {
        j.e(c0776a, "backEvent");
        j.e(viewGroup, "container");
    }

    public void d(ViewGroup viewGroup) {
        j.e(viewGroup, "container");
    }
}
