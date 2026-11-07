package p174r3;

import com.ayah.common.data.source.database.BookDatabase;
import com.ayah.common.data.source.json.model.booklist.BookType;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public BookType f21533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public BookDatabase f21534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f21535t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f21536u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21537v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, c cVar) {
        super(cVar);
        this.f21536u = lVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21535t = obj;
        this.f21537v |= Integer.MIN_VALUE;
        return this.f21536u.d(null, this);
    }
}
