package p198u3;

import com.ayah.common.data.dao.bookmark.BookmarkType;
import p077h3.a;
import p124m3.d;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f22917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public BookmarkType f22918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public E9.d f22919t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f22920u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f22921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f22922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22923x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, c cVar) {
        super(cVar);
        this.f22922w = lVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22921v = obj;
        this.f22923x |= Integer.MIN_VALUE;
        return this.f22922w.b(null, null, this);
    }
}
