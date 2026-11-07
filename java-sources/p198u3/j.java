package p198u3;

import com.ayah.common.data.dao.bookmark.BookmarkType;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public BookmarkType f22913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f22914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f22915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22916v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, c cVar) {
        super(cVar);
        this.f22915u = lVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22914t = obj;
        this.f22916v |= Integer.MIN_VALUE;
        return this.f22915u.a(0, null, this);
    }
}
