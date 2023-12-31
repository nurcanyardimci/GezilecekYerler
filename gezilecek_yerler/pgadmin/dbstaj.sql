PGDMP     9    /            	    y            dbstaj    13.4    13.4      �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    dbstaj    DATABASE     c   CREATE DATABASE dbstaj WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE dbstaj;
                postgres    false            �            1259    16434    gezilecek_yerler    TABLE     �   CREATE TABLE public.gezilecek_yerler (
    id bigint NOT NULL,
    plaka_kodu bigint,
    fotograf_gezilecek text,
    baslik text,
    aciklama text
);
 $   DROP TABLE public.gezilecek_yerler;
       public         heap    postgres    false            �            1259    16432    gezilecek_yerler_id_seq    SEQUENCE     �   CREATE SEQUENCE public.gezilecek_yerler_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.gezilecek_yerler_id_seq;
       public          postgres    false    205            �           0    0    gezilecek_yerler_id_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.gezilecek_yerler_id_seq OWNED BY public.gezilecek_yerler.id;
          public          postgres    false    204            �            1259    16423 	   restorant    TABLE     �   CREATE TABLE public.restorant (
    id bigint NOT NULL,
    plaka_kodu bigint,
    "restorant_Adi" text,
    fotograf_restorant text
);
    DROP TABLE public.restorant;
       public         heap    postgres    false            �            1259    16421    restorant_id_seq    SEQUENCE     y   CREATE SEQUENCE public.restorant_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.restorant_id_seq;
       public          postgres    false    203            �           0    0    restorant_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.restorant_id_seq OWNED BY public.restorant.id;
          public          postgres    false    202            �            1259    16401    sehir    TABLE     }   CREATE TABLE public.sehir (
    id bigint NOT NULL,
    sehir_adi text,
    sehir_plaka bigint,
    "sehirAdiTurkce" text
);
    DROP TABLE public.sehir;
       public         heap    postgres    false            �            1259    16399    sehir_id_seq    SEQUENCE     u   CREATE SEQUENCE public.sehir_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.sehir_id_seq;
       public          postgres    false    201            �           0    0    sehir_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.sehir_id_seq OWNED BY public.sehir.id;
          public          postgres    false    200            �            1259    16445    urun    TABLE     {   CREATE TABLE public.urun (
    id bigint NOT NULL,
    urun_fotograf text,
    urun_baslik text,
    plaka_kodu integer
);
    DROP TABLE public.urun;
       public         heap    postgres    false            �            1259    16443    urun_id_seq    SEQUENCE     t   CREATE SEQUENCE public.urun_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.urun_id_seq;
       public          postgres    false    207            �           0    0    urun_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.urun_id_seq OWNED BY public.urun.id;
          public          postgres    false    206            :           2604    16437    gezilecek_yerler id    DEFAULT     z   ALTER TABLE ONLY public.gezilecek_yerler ALTER COLUMN id SET DEFAULT nextval('public.gezilecek_yerler_id_seq'::regclass);
 B   ALTER TABLE public.gezilecek_yerler ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    205    204    205            9           2604    16426    restorant id    DEFAULT     l   ALTER TABLE ONLY public.restorant ALTER COLUMN id SET DEFAULT nextval('public.restorant_id_seq'::regclass);
 ;   ALTER TABLE public.restorant ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    202    203    203            8           2604    16404    sehir id    DEFAULT     d   ALTER TABLE ONLY public.sehir ALTER COLUMN id SET DEFAULT nextval('public.sehir_id_seq'::regclass);
 7   ALTER TABLE public.sehir ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    201    200    201            ;           2604    16448    urun id    DEFAULT     b   ALTER TABLE ONLY public.urun ALTER COLUMN id SET DEFAULT nextval('public.urun_id_seq'::regclass);
 6   ALTER TABLE public.urun ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    207    206    207            �          0    16434    gezilecek_yerler 
   TABLE DATA           `   COPY public.gezilecek_yerler (id, plaka_kodu, fotograf_gezilecek, baslik, aciklama) FROM stdin;
    public          postgres    false    205   �        �          0    16423 	   restorant 
   TABLE DATA           X   COPY public.restorant (id, plaka_kodu, "restorant_Adi", fotograf_restorant) FROM stdin;
    public          postgres    false    203   �2       �          0    16401    sehir 
   TABLE DATA           M   COPY public.sehir (id, sehir_adi, sehir_plaka, "sehirAdiTurkce") FROM stdin;
    public          postgres    false    201   �3       �          0    16445    urun 
   TABLE DATA           J   COPY public.urun (id, urun_fotograf, urun_baslik, plaka_kodu) FROM stdin;
    public          postgres    false    207   4       �           0    0    gezilecek_yerler_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.gezilecek_yerler_id_seq', 1, true);
          public          postgres    false    204            �           0    0    restorant_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.restorant_id_seq', 1, true);
          public          postgres    false    202            �           0    0    sehir_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.sehir_id_seq', 1, true);
          public          postgres    false    200            �           0    0    urun_id_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('public.urun_id_seq', 1, true);
          public          postgres    false    206            A           2606    16442 &   gezilecek_yerler gezilecek_yerler_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.gezilecek_yerler
    ADD CONSTRAINT gezilecek_yerler_pkey PRIMARY KEY (id);
 P   ALTER TABLE ONLY public.gezilecek_yerler DROP CONSTRAINT gezilecek_yerler_pkey;
       public            postgres    false    205            ?           2606    16431    restorant restorant_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.restorant
    ADD CONSTRAINT restorant_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.restorant DROP CONSTRAINT restorant_pkey;
       public            postgres    false    203            =           2606    16409    sehir sehir_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.sehir
    ADD CONSTRAINT sehir_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.sehir DROP CONSTRAINT sehir_pkey;
       public            postgres    false    201            C           2606    16453    urun urun_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.urun
    ADD CONSTRAINT urun_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.urun DROP CONSTRAINT urun_pkey;
       public            postgres    false    207            �      x��ZMo#9�=ۿ�7w���1'���k��T�]�@a{��$Zb'��C@�Է�,л�R�E{>��R���%�^�T�l�`�Je2�`ċ�����\OL���.�u��igJ��i>�y'wԵ����;-�S�n�Μ.����������o�|���U��i٬�X��]T��.�s����AU��n���ګ�.j��_���{~�A�^��ua��`�ҙ������mc*���0ĲEn1�-����-fXЙƙ�3����o�w��=���%�����Ĕ�J��uʺ�g�Q]׹�!��*[=BDUb��7
�l1����c�S�m]�?�iaU�~�fJٴ֮���*=Ƙ~�a�3�Ƴ��V0��4F�\�7�0T��3�V{��S�Փo4&,55E<��N�JZ}�w���q�����i��flt��ϿR��E���_���snh�/��tC[P�27z�t�bi���S;wv}����})��D=�;����rS/8�&��Y��׮�r��cUhq�� ��]����}D/�WA:XO�k�m��)`K��D����@�* b��d��M|��7�5T���i-�uB��CNP�)��=���9�s����ҡ�K?��)&i+=45�����Y��q�������l���c���T�*�%�:ā3���n���� ϶��x�jhM`��>���LQ�Q$Ϸw���e�ڋ�y�)�O��գ[=�rKO�u7��zY{Gp�g'�9�cG����.����N2�EK���#�y���O�djVT�!�j˗�
�A��+͆-WO�����K�$��h����Þ8D�x�w9�@����
��qbȱ��<����&A�i�6B�q)d����>��U2�&,q�2��q��EO��;�y�]��f}g��r�/6�����Օ���ߖ�����|ja���B_c��g���+_(
Cr֖�q&!�%����� �(� d�@��sS�,�1���,Ӿ�88�KX�Kn0�{��Ė���W	I�=j�Ѐ�����a�{AeBEf�����-�"�AD���Uaf>n!��VV�.��C=����E9�G�-���Gt*���0�XK_�x��x��a�C1p1Mf��`���L���������<<�����	&��l�[u��ٽx�'؋�~F�;���t ;�aC.@t�o��c��X����s;R][^Q{��~��	6ڶ�]vdR��sOZ$}���Ϟ+��f��$;��[��C...T#���{ڑ�q��h�'���
������Y5�e�T���d��	�T��Lr=�|��Z=k07|�f^��o�� ��cbz
��]SESS�.6q�I������pYAn	A5��|ֱ!�[�b��/�Z}��忍��2b�>�b����}\�(͒�H#S�(�6Ϡ�`i����ƘR���|t��*��c���e�H�n�'�$�bE6�E��F`<R>���B���������{0�U�r�Nފ�<��!�$ wP.Ύ; ��J��:c�a��t��gD�f��0>��s�`)2��T�-��?N��2ߔL����v�	��
�*$+�gRCS��ޡ  /g�>�7a�p!���6˰{�)�q�GLq��������C���^��Ղ��؁�tRA�����T���B��� �����6y�ZF�pS�j^��*�U�[�v�}��`����W�������$�`{,���r\P`ݬDd�6�h=�m�T;L��t%����Z�FD%�� ��䦏��4Z, Dʲ<!&�,C*I5�55h����Ի����+�z�\]�u�j�sB	)�� ��f9�Qn��R����]j_�o�x�9�c�5��&�c�J:�Bb)��Y��(XrC� ���ሧćE
�y� Z?��$*^�&�A�
D��������eo;�������)���/�3�t�E0���i�@;�Ҕ5�c��+lg�P��؛�s��R(�[��=�C�/����ǵg��'?�L �xpq|��H�1���Aj��'G|T���x�*J]�)z]1���"��x�($:�\tjZK^�aP��sp�+ނA?�"�3��q`�E��5S}M����wr��5�{��:���`۹�E�)	�Т�(�.^��z�6y%���E;dp��4ETi����)���t;���>xn5����G���&D���1#ҋ���A�����
B�p@�{D�e�����Y��$�Zu�r�ٳ�5�(Ҥ C����o]h0h���(<j66�����ֲ̅�X6"���_/�D@��ҩ:�d(�	�[(>�0���6s	��Sdsm��6Et��v��5�e�I���/���1�ћ<Ud�\j,$65���Tvb�UhOt��ƴ��/$�y�c$��f`���V{M�l$���?����.���Ue�?�QR�a@@ث�&K�~1p8í�+����vB��g�=��\�Z{� nkW�e$&g�"h0��M[E�QZ�9��S��w��J��#�d\�Ƅ4�d3����YD�R�	�G^.R���c3�������lh��Pʪ�9��*1��}��!'h�<M�ծ�'�O�d���E�K��l�(����M��"ob
r4BȒ~cE�dK��f�4^�X�n&���R�J���0�;8���N7��~X��-�Wn��%Y�#B�a��K���Pkj����f��Em�q��
bl�L9�?l�1����	
U���)9��di�� ��n��Mrl��gЩV0�fn4O�Hi��B �7������V��M��m^���O�^|U��W &�b���se�M�~p��G��hӟ{��p�38Ro31�8���t�}�H��k��:=�ZO�W�X@Q�Rф� &9�o�|�Z�3���bRW셁;u��Y		^��]�ȸ�c�y��ux�ؖ�Q�R�
=�M+�[�7�>u�����t�����5{��0�Cz
�

>y�#-Y��"�e_,o,�H�v���'��m���D��R)cQJ�C0K���=	@�n�^�0�Ӈ�����ޞ9X�n�K�8m3����uJ&	6tڡ�������CRY0C����'�#5����<>P_����O��絛�U�kp�)Ɔ�[^mZ����i[������	��{���>��\��-0V�JAk��{~�q�����
u]ci$vu͖�(�q��?����;���T��k|:��+�,�h�	��g2۷�q�S���;�V��sH��(��lg�R¹e5M�ڨ=�+�-)�
M����;�y]���L�:~1=��<�q�w�i��ԋ���S�'���_��:�ۃ�л$)m���!c����3ʥ6��V���Xk�&�������������*\�k��<������������u4�:Z�%n-\]�q�%��X�s3|F���{��[a���Z
ݡd'{���o�v�X���"���0G~Hg���a?;��A[���jS�D6&�I���&C�}q�{U�G�H�1�ti���C+��Mvepm��hu���3s����/ӯ�@�%�Lęg��Ϥ��1�N���9|�}�}Y9a��|s8&1X�~!�ș>���`���bs̫'h7�7 ;x!����c���V�7ڦ�����y"����C���yF��B��'��R��oKOG���mŰ �dr��|+$9X=�Q��I#�-�Bl���/~���������S�3�v����"y� P�N�{x����Kk�� � �k6�·Vb��Qk`jB��a���lS�X)(a��&E�:�5�p�[T�e�$V�Уi�&xo��}u���3!�B�u�&�{��NY+ԥ�'y�ل���y��٬a'���Xc-Xȥ�GBm�ބ}����t�p6�F<"���{�����%v�h��sj(zz[5�t��T�{�J3��#���z��vW�y�.�o �'�DX�#\�9F{�B��: J  ���S`��c�Y1+��P|+q	 ��PuHh@��^�6�b��No�̸�F/��9��ح�-"_|m,S'0|���67�հ]�����or���2
!�S`��]�%��^�<��р������ӃM_�	������ꖼ\�Q�ǍZ<v�/��6��?���2y^D��Q1�Aμ#E�*�qGe���R�%��$u���<�KD4%G�e�6@�脝�;�i�<�r��MG��/)BRQ0����$M�`����yJk2b!0TG�&H�X�,��R�AuOI{�%�.����1����q�I752�����Ԫ�s>���ãv�`Mټ�\}R@F��c����l�A�ſ��G=p~�u74��������?�p�[��i +����k��e	m+���圵�ս���w��Wg����_����m��HŎ�v����m��ʉle���L���x+73�ѿz��}H9����S�����Y��m��̐X#3���B���p���^ l�YT����(�=�"���`�T�xjO�qV꿆O�F!��N�MHr��̱GRl��������%c^      �   �   x�=�=� �N�	�$���2��U�50�C�!Ecΐ��.x/�������QQ��2�I��$��$:��lX�����"�F�ח$gf�Ԑd�^F[�
���t�fi�6$\ڈ��l�@Z�-)�d�r�y�ESP�[Ȟ�>ɫ�#�<:73�
�ĭ�C��jg���c���T�      �   7   x�3�t�I��L�42��l<2�˘�1/;�(����2�tLI�K�4��\1z\\\ @��      �   �   x�=пN�0��~
?APZ0�G)�ʂ��Ҝ���Xq�(y��0uK�^�n�v�}?�$�L�P��h��Tɇ�؋��b��+e���:C;�������t�E%�Z|�7�O��o�/0
���נ+�u��Śzb)�����]	����)��h�v=&�X�pZ�+��<�yt�2JE���70@7�"w��M�2~]E%� ��C9�Xa����3�E�[E��g�4�h+9�I8�wS{�     