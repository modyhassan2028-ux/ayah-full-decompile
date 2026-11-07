package N9;

/* JADX INFO: loaded from: classes.dex */
public final class O extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6121r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ InterfaceC0416i f6123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object[] f6124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q9.i f6125v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(p150o9.c cVar, p241y9.g gVar) {
        super(3, cVar);
        this.f6125v = (q9.i) gVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [q9.i, y9.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q9.i, y9.h] */
    /* JADX WARN: Type inference failed for: r1v2, types: [q9.i, y9.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [q9.i, y9.f] */
    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC0416i interfaceC0416i = (InterfaceC0416i) obj;
        Object[] objArr = (Object[]) obj2;
        p150o9.c cVar = (p150o9.c) obj3;
        switch (this.f6121r) {
            case 0:
                O o10 = new O(cVar, (p241y9.g) this.f6125v);
                o10.f6123t = interfaceC0416i;
                o10.f6124u = objArr;
                return o10.invokeSuspend(p110k9.y.f19095a);
            case 1:
                O o11 = new O(cVar, (p241y9.h) this.f6125v);
                o11.f6123t = interfaceC0416i;
                o11.f6124u = objArr;
                return o11.invokeSuspend(p110k9.y.f19095a);
            case 2:
                O o12 = new O(cVar, (p241y9.i) this.f6125v);
                o12.f6123t = interfaceC0416i;
                o12.f6124u = objArr;
                return o12.invokeSuspend(p110k9.y.f19095a);
            default:
                O o13 = new O((p241y9.f) this.f6125v, cVar);
                o13.f6123t = interfaceC0416i;
                o13.f6124u = objArr;
                return o13.invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [q9.i, y9.g] */
    /* JADX WARN: Type inference failed for: r2v8, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r4v4, types: [q9.i, y9.h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [q9.i, y9.i] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0416i interfaceC0416i;
        InterfaceC0416i interfaceC0416i2;
        InterfaceC0416i interfaceC0416i3;
        O o10;
        InterfaceC0416i interfaceC0416i4;
        switch (this.f6121r) {
            case 0:
                int i10 = this.f6122s;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC0416i = this.f6123t;
                        p110k9.a.e(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    return p110k9.y.f19095a;
                }
                p110k9.a.e(obj);
                interfaceC0416i = this.f6123t;
                Object[] objArr = this.f6124u;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f6123t = interfaceC0416i;
                this.f6122s = 1;
                obj = this.f6125v.i(obj2, obj3, obj4, this);
                if (obj == aVar) {
                    return aVar;
                }
                this.f6123t = null;
                this.f6122s = 2;
                if (interfaceC0416i.b(obj, this) == aVar) {
                    return aVar;
                }
                return p110k9.y.f19095a;
            case 1:
                int i11 = this.f6122s;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC0416i2 = this.f6123t;
                        p110k9.a.e(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    return p110k9.y.f19095a;
                }
                p110k9.a.e(obj);
                interfaceC0416i2 = this.f6123t;
                Object[] objArr2 = this.f6124u;
                Object obj5 = objArr2[0];
                Object obj6 = objArr2[1];
                Object obj7 = objArr2[2];
                Object obj8 = objArr2[3];
                this.f6123t = interfaceC0416i2;
                this.f6122s = 1;
                obj = this.f6125v.a(obj5, obj6, obj7, obj8, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                this.f6123t = null;
                this.f6122s = 2;
                if (interfaceC0416i2.b(obj, this) == aVar2) {
                    return aVar2;
                }
                return p110k9.y.f19095a;
            case 2:
                int i12 = this.f6122s;
                p161p9.a aVar3 = p161p9.a.f21156r;
                if (i12 != 0) {
                    if (i12 == 1) {
                        interfaceC0416i3 = this.f6123t;
                        p110k9.a.e(obj);
                        o10 = this;
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    return p110k9.y.f19095a;
                }
                p110k9.a.e(obj);
                interfaceC0416i3 = this.f6123t;
                Object[] objArr3 = this.f6124u;
                Object obj9 = objArr3[0];
                Object obj10 = objArr3[1];
                Object obj11 = objArr3[2];
                Object obj12 = objArr3[3];
                Object obj13 = objArr3[4];
                this.f6123t = interfaceC0416i3;
                this.f6122s = 1;
                obj = this.f6125v.k(obj9, obj10, obj11, obj12, obj13, this);
                o10 = this;
                if (obj == aVar3) {
                    return aVar3;
                }
                o10.f6123t = null;
                o10.f6122s = 2;
                if (interfaceC0416i3.b(obj, this) == aVar3) {
                    return aVar3;
                }
                return p110k9.y.f19095a;
            default:
                int i13 = this.f6122s;
                p161p9.a aVar4 = p161p9.a.f21156r;
                if (i13 != 0) {
                    if (i13 == 1) {
                        interfaceC0416i4 = this.f6123t;
                        p110k9.a.e(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    return p110k9.y.f19095a;
                }
                p110k9.a.e(obj);
                interfaceC0416i4 = this.f6123t;
                Object[] objArr4 = this.f6124u;
                Object obj14 = objArr4[0];
                Object obj15 = objArr4[1];
                this.f6123t = interfaceC0416i4;
                this.f6122s = 1;
                obj = this.f6125v.d(obj14, obj15, this);
                if (obj == aVar4) {
                    return aVar4;
                }
                this.f6123t = null;
                this.f6122s = 2;
                if (interfaceC0416i4.b(obj, this) == aVar4) {
                    return aVar4;
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(p150o9.c cVar, p241y9.h hVar) {
        super(3, cVar);
        this.f6125v = (q9.i) hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(p150o9.c cVar, p241y9.i iVar) {
        super(3, cVar);
        this.f6125v = (q9.i) iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(p241y9.f fVar, p150o9.c cVar) {
        super(3, cVar);
        this.f6125v = (q9.i) fVar;
    }
}
