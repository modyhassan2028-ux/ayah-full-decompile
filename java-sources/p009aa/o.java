package p009aa;

import W9.f;
import Y9.c0;
import Y9.f0;
import Y9.i0;
import Y9.l0;
import java.util.Set;
import p120l9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f11268a = l.p0(new f[]{f0.f10512b, i0.f10522b, c0.f10502b, l0.f10530b});

    public static final boolean a(f fVar) {
        j.e(fVar, "<this>");
        return fVar.f() && f11268a.contains(fVar);
    }
}
