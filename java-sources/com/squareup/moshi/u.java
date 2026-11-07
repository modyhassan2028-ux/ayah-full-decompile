package com.squareup.moshi;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w f15490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w f15491s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f15493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f15494v;

    public u(x xVar, int i10) {
        this.f15494v = i10;
        this.f15493u = xVar;
        this.f15490r = xVar.f15509t.f15500u;
        this.f15492t = xVar.f15511v;
    }

    public final Object a() {
        return b();
    }

    public final w b() {
        w wVar = this.f15490r;
        x xVar = this.f15493u;
        if (wVar == xVar.f15509t) {
            throw new NoSuchElementException();
        }
        if (xVar.f15511v != this.f15492t) {
            throw new ConcurrentModificationException();
        }
        this.f15490r = wVar.f15500u;
        this.f15491s = wVar;
        return wVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15490r != this.f15493u.f15509t;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f15494v) {
            case 1:
                return b().f15502w;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        w wVar = this.f15491s;
        if (wVar == null) {
            throw new IllegalStateException();
        }
        x xVar = this.f15493u;
        xVar.c(wVar, true);
        this.f15491s = null;
        this.f15492t = xVar.f15511v;
    }
}
