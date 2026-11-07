package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class H2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H2 f14042c = new H2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14044b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0902x2 f14043a = new C0902x2(0);

    public final K2 a(Class cls) {
        K2 k2U;
        Charset charset = AbstractC0863p2.f14382a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f14044b;
        K2 k7 = (K2) concurrentHashMap.get(cls);
        if (k7 != null) {
            return k7;
        }
        C0902x2 c0902x2 = this.f14043a;
        c0902x2.getClass();
        C0818g2 c0818g2 = L2.f14066a;
        AbstractC0828i2.class.isAssignableFrom(cls);
        J2 j2B = ((C0902x2) c0902x2.f14509r).b(cls);
        if ((j2B.f14061d & 2) == 2) {
            C0818g2 c0818g3 = L2.f14066a;
            C0818g2 c0818g4 = AbstractC0798c2.f14219a;
            k2U = new E2(c0818g3, j2B.f14058a);
        } else {
            int i10 = F2.f14028a;
            int i11 = AbstractC0887u2.f14427a;
            C0818g2 c0818g5 = L2.f14066a;
            C0818g2 c0818g6 = j2B.a() + (-1) != 1 ? AbstractC0798c2.f14219a : null;
            int i12 = A2.f13993a;
            k2U = D2.u(j2B, c0818g5, c0818g6);
        }
        K2 k10 = (K2) concurrentHashMap.putIfAbsent(cls, k2U);
        return k10 != null ? k10 : k2U;
    }
}
