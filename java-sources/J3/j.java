package J3;

import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import T1.InterfaceC0491h;
import com.squareup.moshi.JsonAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0491h f4260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonAdapter f4261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X1.e f4262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X1.e f4263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X1.e f4264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0415h f4265f;

    public j(InterfaceC0491h interfaceC0491h, JsonAdapter jsonAdapter) {
        p251z9.j.e(jsonAdapter, "appNotificationJsonAdapter");
        this.f4260a = interfaceC0491h;
        this.f4261b = jsonAdapter;
        this.f4262c = F3.a.f2354m;
        this.f4263d = F3.a.f2355n;
        this.f4264e = F3.a.f2356o;
        this.f4265f = AbstractC0419l.m(new h(interfaceC0491h.b(), this, 1));
    }
}
