package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0884u implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0820h f14412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Aa.a f14413b;

    public C0884u(AbstractC0820h abstractC0820h, Aa.a aVar) {
        this.f14412a = abstractC0820h;
        this.f14413b = aVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC0850n interfaceC0850n = (InterfaceC0850n) obj;
        InterfaceC0850n interfaceC0850n2 = (InterfaceC0850n) obj2;
        if (interfaceC0850n instanceof r) {
            return !(interfaceC0850n2 instanceof r) ? 1 : 0;
        }
        if (interfaceC0850n2 instanceof r) {
            return -1;
        }
        AbstractC0820h abstractC0820h = this.f14412a;
        return abstractC0820h == null ? interfaceC0850n.h().compareTo(interfaceC0850n2.h()) : (int) p185s8.u0.O(abstractC0820h.a(this.f14413b, Arrays.asList(interfaceC0850n, interfaceC0850n2)).b().doubleValue());
    }
}
