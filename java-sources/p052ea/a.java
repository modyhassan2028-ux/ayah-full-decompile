package p052ea;

import java.util.ArrayList;
import java.util.HashMap;
import ka.q;
import ka.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f15865d;

    public a(a aVar) {
        this.f15862a = aVar.f15862a;
        this.f15863b = aVar.f15863b;
        r rVar = aVar.f15865d;
        this.f15865d = rVar == null ? new r(new q()) : rVar;
        this.f15864c = aVar.f15864c;
    }

    public a() {
        this.f15863b = new HashMap();
        this.f15864c = new ArrayList();
    }
}
