USE [ProjectSem2]
GO
/****** Object:  Table [dbo].[admins_roles]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[admins_roles](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[admin_id] [bigint] NOT NULL,
	[role_id] [bigint] NOT NULL,
 CONSTRAINT [PK_admins_roles] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[appointment_schedule]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[appointment_schedule](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[created_at] [datetime2](7) NULL,
	[name] [varchar](255) NULL,
	[order_date] [date] NULL,
	[order_status] [varchar](255) NULL,
	[phone] [varchar](255) NULL,
	[updated_at] [datetime2](7) NULL,
	[examination_price_id] [bigint] NULL,
	[examination_time_id] [bigint] NULL,
	[specialty_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[examination_day]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[examination_day](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[created_at] [datetime2](7) NULL,
	[name] [varchar](255) NULL,
	[updated_at] [datetime2](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[examination_price]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[examination_price](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[created_at] [datetime2](7) NULL,
	[name] [varchar](255) NULL,
	[updated_at] [datetime2](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[examination_schedule]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[examination_schedule](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[created_at] [datetime2](7) NULL,
	[updated_at] [datetime2](7) NULL,
	[slot] [int] NULL,
	[specialty_id] [bigint] NULL,
	[examination_day_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[examination_time]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[examination_time](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[created_at] [datetime2](7) NULL,
	[name] [varchar](255) NULL,
	[updated_at] [datetime2](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[role]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[role](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[name] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_admin]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_admin](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[address] [varchar](255) NULL,
	[avatar] [varchar](255) NULL,
	[created_at] [datetime2](7) NULL,
	[email] [varchar](255) NULL,
	[gender] [bit] NULL,
	[name] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[phone] [varchar](255) NULL,
	[updated_at] [datetime2](7) NULL,
	[user_name] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_contact]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_contact](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[created_at] [datetime2](7) NULL,
	[email] [varchar](255) NULL,
	[name] [varchar](255) NULL,
	[note] [varchar](255) NULL,
	[phone] [varchar](255) NULL,
	[updated_at] [datetime2](7) NULL,
	[contact_status] [bit] NULL,
 CONSTRAINT [PK__tbl_cont__3213E83FCD0DF22E] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_doctor]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_doctor](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[address] [varchar](255) NULL,
	[avatar] [varchar](255) NULL,
	[created_at] [datetime2](7) NULL,
	[gender] [bit] NULL,
	[name] [varchar](255) NULL,
	[phone] [varchar](255) NULL,
	[status] [bit] NULL,
	[updated_at] [datetime2](7) NULL,
	[specialty_id] [bigint] NULL,
 CONSTRAINT [PK__tbl_doct__3213E83F09842410] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_specialty]    Script Date: 9/19/2022 2:55:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_specialty](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[created_at] [datetime2](7) NULL,
	[description] [varchar](255) NULL,
	[name] [varchar](255) NULL,
	[updated_at] [datetime2](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[admins_roles] ON 

INSERT [dbo].[admins_roles] ([id], [admin_id], [role_id]) VALUES (1, 2, 1)
INSERT [dbo].[admins_roles] ([id], [admin_id], [role_id]) VALUES (2, 3, 1)
INSERT [dbo].[admins_roles] ([id], [admin_id], [role_id]) VALUES (4, 5, 1)
SET IDENTITY_INSERT [dbo].[admins_roles] OFF
GO
SET IDENTITY_INSERT [dbo].[appointment_schedule] ON 

INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (13, CAST(N'2022-09-09T20:26:52.1550000' AS DateTime2), N'Nguyen Hoang Son', CAST(N'2022-09-20' AS Date), N'Confirm', N'0357214841', CAST(N'2022-09-14T09:36:00.3770000' AS DateTime2), 3, 4, 3)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (21, CAST(N'2022-09-10T23:43:25.1710000' AS DateTime2), N'Pham Thanh Cong', CAST(N'2022-09-19' AS Date), N'Confirm', N'0435765412', CAST(N'2022-09-14T09:18:30.4890000' AS DateTime2), 2, 2, 7)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (38, CAST(N'2022-09-11T00:07:39.8280000' AS DateTime2), N'Nguyen Thanh Cong', CAST(N'2022-09-18' AS Date), N'Confirm', N'0345249742', CAST(N'2022-09-14T09:36:25.2720000' AS DateTime2), 1, 4, 8)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (41, CAST(N'2022-09-11T00:14:41.0820000' AS DateTime2), N'Nguyen Thanh Tam', CAST(N'2022-09-12' AS Date), N'Done', N'0345268742', CAST(N'2022-09-13T22:42:36.3210000' AS DateTime2), 1, 4, 8)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (42, CAST(N'2022-09-11T00:15:36.7890000' AS DateTime2), N'Tran Thanh Tu', CAST(N'2022-09-18' AS Date), N'Confirm', N'0341268742', CAST(N'2022-09-14T09:50:32.7500000' AS DateTime2), 1, 4, 8)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (47, CAST(N'2022-09-14T08:55:07.2760000' AS DateTime2), N'Nguyen Van A', CAST(N'2022-09-18' AS Date), N'Confirm', N'0243457610', CAST(N'2022-09-14T09:46:51.9930000' AS DateTime2), 2, 2, 8)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (49, CAST(N'2022-09-14T09:45:57.2190000' AS DateTime2), N'Le Thi C', CAST(N'2022-08-19' AS Date), N'Done', N'0146753951', CAST(N'2022-09-14T11:07:42.1650000' AS DateTime2), 1, 1, 6)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (50, CAST(N'2022-09-14T11:05:25.8850000' AS DateTime2), N'Tran Thi K', CAST(N'2022-09-19' AS Date), NULL, N'0428756320', CAST(N'2022-09-14T11:05:25.8850000' AS DateTime2), 2, 2, 13)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (52, CAST(N'2022-09-14T14:03:08.0680000' AS DateTime2), N'Nguyen Van Dat', CAST(N'2022-09-17' AS Date), NULL, N'0353096512', CAST(N'2022-09-14T14:03:08.0680000' AS DateTime2), 2, 9, 5)
INSERT [dbo].[appointment_schedule] ([id], [created_at], [name], [order_date], [order_status], [phone], [updated_at], [examination_price_id], [examination_time_id], [specialty_id]) VALUES (54, CAST(N'2022-09-14T20:32:54.6570000' AS DateTime2), N'Vu Thu Thuy', CAST(N'2022-09-19' AS Date), NULL, N'0385462157', CAST(N'2022-09-14T20:32:54.6570000' AS DateTime2), 1, 4, 10)
SET IDENTITY_INSERT [dbo].[appointment_schedule] OFF
GO
SET IDENTITY_INSERT [dbo].[examination_day] ON 

INSERT [dbo].[examination_day] ([id], [created_at], [name], [updated_at]) VALUES (1, CAST(N'2022-09-07T11:23:52.3550000' AS DateTime2), N'Thursday 15-09-2022', CAST(N'2022-09-08T10:20:24.3770000' AS DateTime2))
INSERT [dbo].[examination_day] ([id], [created_at], [name], [updated_at]) VALUES (2, CAST(N'2022-09-07T11:24:21.7140000' AS DateTime2), N'Friday 16-09-2022', CAST(N'2022-09-14T09:17:07.4140000' AS DateTime2))
INSERT [dbo].[examination_day] ([id], [created_at], [name], [updated_at]) VALUES (3, CAST(N'2022-09-07T11:24:55.4180000' AS DateTime2), N'Saturday 17-09-2022', CAST(N'2022-09-14T09:17:14.6340000' AS DateTime2))
INSERT [dbo].[examination_day] ([id], [created_at], [name], [updated_at]) VALUES (4, CAST(N'2022-09-07T11:25:16.2450000' AS DateTime2), N'Sunday 18-09-2022', CAST(N'2022-09-14T09:17:21.1670000' AS DateTime2))
INSERT [dbo].[examination_day] ([id], [created_at], [name], [updated_at]) VALUES (5, CAST(N'2022-09-07T11:25:42.7250000' AS DateTime2), N'Monday 19-09-2022', CAST(N'2022-09-14T09:17:26.6120000' AS DateTime2))
INSERT [dbo].[examination_day] ([id], [created_at], [name], [updated_at]) VALUES (6, CAST(N'2022-09-07T11:26:04.2590000' AS DateTime2), N'Tuesday 20-09-2022', CAST(N'2022-09-14T09:17:32.9070000' AS DateTime2))
INSERT [dbo].[examination_day] ([id], [created_at], [name], [updated_at]) VALUES (7, CAST(N'2022-09-07T11:26:21.5630000' AS DateTime2), N'Wednesday 14-09-2022', CAST(N'2022-09-07T11:26:28.1150000' AS DateTime2))
SET IDENTITY_INSERT [dbo].[examination_day] OFF
GO
SET IDENTITY_INSERT [dbo].[examination_price] ON 

INSERT [dbo].[examination_price] ([id], [created_at], [name], [updated_at]) VALUES (1, CAST(N'2022-08-20T22:57:06.8720000' AS DateTime2), N'Basic: 25$', CAST(N'2022-08-31T08:54:15.0980000' AS DateTime2))
INSERT [dbo].[examination_price] ([id], [created_at], [name], [updated_at]) VALUES (2, CAST(N'2022-08-20T22:57:51.8110000' AS DateTime2), N'Standard: 40$', CAST(N'2022-08-31T08:55:37.9060000' AS DateTime2))
INSERT [dbo].[examination_price] ([id], [created_at], [name], [updated_at]) VALUES (3, CAST(N'2022-08-20T22:57:53.4510000' AS DateTime2), N'Premium: 60$', CAST(N'2022-08-31T08:56:15.7450000' AS DateTime2))
SET IDENTITY_INSERT [dbo].[examination_price] OFF
GO
SET IDENTITY_INSERT [dbo].[examination_schedule] ON 

INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (1, CAST(N'2022-08-20T23:43:55.0910000' AS DateTime2), CAST(N'2022-09-09T10:06:10.6750000' AS DateTime2), 6, 1, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (3, CAST(N'2022-08-21T10:54:11.8080000' AS DateTime2), CAST(N'2022-09-09T10:07:25.3690000' AS DateTime2), 8, 3, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (5, CAST(N'2022-09-03T22:11:07.4000000' AS DateTime2), CAST(N'2022-09-03T22:11:07.4000000' AS DateTime2), 6, 1, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (6, CAST(N'2022-09-03T22:11:27.0100000' AS DateTime2), CAST(N'2022-09-03T22:11:27.0100000' AS DateTime2), 6, 1, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (7, CAST(N'2022-09-03T22:11:38.3420000' AS DateTime2), CAST(N'2022-09-03T22:11:38.3420000' AS DateTime2), 6, 1, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (8, CAST(N'2022-09-03T22:11:43.1620000' AS DateTime2), CAST(N'2022-09-03T22:11:43.1620000' AS DateTime2), 6, 1, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (9, CAST(N'2022-09-03T22:11:46.2660000' AS DateTime2), CAST(N'2022-09-03T22:12:06.9630000' AS DateTime2), 6, 1, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (10, CAST(N'2022-09-03T22:32:44.9700000' AS DateTime2), CAST(N'2022-09-09T10:07:46.8060000' AS DateTime2), 8, 3, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (11, CAST(N'2022-09-03T22:32:52.2910000' AS DateTime2), CAST(N'2022-09-03T22:32:52.2910000' AS DateTime2), 6, 3, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (12, CAST(N'2022-09-03T22:33:00.9530000' AS DateTime2), CAST(N'2022-09-03T22:33:00.9530000' AS DateTime2), 6, 3, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (13, CAST(N'2022-09-03T22:33:10.5520000' AS DateTime2), CAST(N'2022-09-03T22:33:10.5520000' AS DateTime2), 8, 3, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (14, CAST(N'2022-09-03T22:33:20.0980000' AS DateTime2), CAST(N'2022-09-03T22:33:20.0980000' AS DateTime2), 8, 3, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (15, CAST(N'2022-09-03T22:44:02.3660000' AS DateTime2), CAST(N'2022-09-03T22:44:02.3660000' AS DateTime2), 6, 5, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (16, CAST(N'2022-09-03T22:44:13.0860000' AS DateTime2), CAST(N'2022-09-03T22:46:50.0530000' AS DateTime2), 6, 5, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (17, CAST(N'2022-09-03T22:44:19.3360000' AS DateTime2), CAST(N'2022-09-03T22:45:25.1940000' AS DateTime2), 6, 5, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (18, CAST(N'2022-09-03T22:44:26.0570000' AS DateTime2), CAST(N'2022-09-03T22:44:26.0570000' AS DateTime2), 6, 5, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (19, CAST(N'2022-09-03T22:44:38.5850000' AS DateTime2), CAST(N'2022-09-03T22:45:50.5020000' AS DateTime2), 6, 5, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (20, CAST(N'2022-09-03T22:46:08.2870000' AS DateTime2), CAST(N'2022-09-03T22:46:08.2870000' AS DateTime2), 6, 5, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (21, CAST(N'2022-09-03T22:53:53.9020000' AS DateTime2), CAST(N'2022-09-03T22:53:53.9020000' AS DateTime2), 6, 6, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (22, CAST(N'2022-09-03T22:54:00.3230000' AS DateTime2), CAST(N'2022-09-03T22:54:00.3230000' AS DateTime2), 6, 6, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (23, CAST(N'2022-09-03T22:54:05.2590000' AS DateTime2), CAST(N'2022-09-03T22:54:05.2590000' AS DateTime2), 6, 6, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (24, CAST(N'2022-09-03T22:54:10.2910000' AS DateTime2), CAST(N'2022-09-03T22:54:10.2910000' AS DateTime2), 6, 6, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (25, CAST(N'2022-09-03T22:54:16.6570000' AS DateTime2), CAST(N'2022-09-03T22:54:52.1680000' AS DateTime2), 6, 6, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (26, CAST(N'2022-09-03T22:54:24.3850000' AS DateTime2), CAST(N'2022-09-03T22:57:20.2700000' AS DateTime2), 6, 6, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (27, CAST(N'2022-09-03T22:54:30.8670000' AS DateTime2), CAST(N'2022-09-03T22:57:09.4920000' AS DateTime2), 10, 7, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (28, CAST(N'2022-09-03T22:57:37.6810000' AS DateTime2), CAST(N'2022-09-03T22:57:37.6810000' AS DateTime2), 10, 7, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (29, CAST(N'2022-09-03T22:57:45.1290000' AS DateTime2), CAST(N'2022-09-03T22:57:45.1290000' AS DateTime2), 10, 7, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (30, CAST(N'2022-09-03T22:57:54.6150000' AS DateTime2), CAST(N'2022-09-03T22:57:54.6150000' AS DateTime2), 10, 7, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (31, CAST(N'2022-09-03T22:58:07.1670000' AS DateTime2), CAST(N'2022-09-03T22:58:07.1670000' AS DateTime2), 10, 7, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (32, CAST(N'2022-09-03T22:58:15.5460000' AS DateTime2), CAST(N'2022-09-03T22:58:15.5460000' AS DateTime2), 10, 7, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (33, CAST(N'2022-09-03T23:15:00.3640000' AS DateTime2), CAST(N'2022-09-03T23:15:00.3640000' AS DateTime2), 6, 8, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (34, CAST(N'2022-09-03T23:15:06.7560000' AS DateTime2), CAST(N'2022-09-03T23:15:06.7560000' AS DateTime2), 6, 8, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (35, CAST(N'2022-09-03T23:15:14.1810000' AS DateTime2), CAST(N'2022-09-03T23:15:14.1810000' AS DateTime2), 6, 8, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (36, CAST(N'2022-09-03T23:15:23.1050000' AS DateTime2), CAST(N'2022-09-03T23:15:23.1050000' AS DateTime2), 6, 8, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (37, CAST(N'2022-09-03T23:15:30.1500000' AS DateTime2), CAST(N'2022-09-03T23:15:30.1500000' AS DateTime2), 6, 8, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (38, CAST(N'2022-09-03T23:15:35.6570000' AS DateTime2), CAST(N'2022-09-03T23:15:35.6570000' AS DateTime2), 6, 8, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (39, CAST(N'2022-09-03T23:18:34.7150000' AS DateTime2), CAST(N'2022-09-03T23:18:34.7150000' AS DateTime2), 6, 9, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (40, CAST(N'2022-09-03T23:18:56.9290000' AS DateTime2), CAST(N'2022-09-03T23:18:56.9290000' AS DateTime2), 6, 9, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (41, CAST(N'2022-09-03T23:19:06.9060000' AS DateTime2), CAST(N'2022-09-03T23:19:06.9060000' AS DateTime2), 6, 9, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (42, CAST(N'2022-09-03T23:19:17.3300000' AS DateTime2), CAST(N'2022-09-03T23:19:17.3300000' AS DateTime2), 6, 9, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (43, CAST(N'2022-09-03T23:19:30.6830000' AS DateTime2), CAST(N'2022-09-03T23:19:30.6830000' AS DateTime2), 6, 9, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (44, CAST(N'2022-09-03T23:19:37.7460000' AS DateTime2), CAST(N'2022-09-03T23:19:37.7460000' AS DateTime2), 6, 9, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (45, CAST(N'2022-09-03T23:30:56.9530000' AS DateTime2), CAST(N'2022-09-03T23:30:56.9530000' AS DateTime2), 2, 10, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (46, CAST(N'2022-09-03T23:31:07.9910000' AS DateTime2), CAST(N'2022-09-03T23:31:07.9910000' AS DateTime2), 2, 10, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (47, CAST(N'2022-09-03T23:31:15.4270000' AS DateTime2), CAST(N'2022-09-03T23:31:15.4270000' AS DateTime2), 2, 10, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (48, CAST(N'2022-09-03T23:31:24.0830000' AS DateTime2), CAST(N'2022-09-03T23:31:24.0830000' AS DateTime2), 2, 10, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (49, CAST(N'2022-09-03T23:31:36.8190000' AS DateTime2), CAST(N'2022-09-03T23:31:36.8190000' AS DateTime2), 2, 10, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (50, CAST(N'2022-09-03T23:31:50.7510000' AS DateTime2), CAST(N'2022-09-03T23:31:50.7510000' AS DateTime2), 0, 10, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (51, CAST(N'2022-09-03T23:38:14.6560000' AS DateTime2), CAST(N'2022-09-03T23:38:14.6560000' AS DateTime2), 8, 11, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (52, CAST(N'2022-09-03T23:38:26.5080000' AS DateTime2), CAST(N'2022-09-03T23:38:26.5080000' AS DateTime2), 8, 11, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (53, CAST(N'2022-09-03T23:38:36.2050000' AS DateTime2), CAST(N'2022-09-03T23:38:36.2050000' AS DateTime2), 8, 11, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (54, CAST(N'2022-09-03T23:38:43.3230000' AS DateTime2), CAST(N'2022-09-03T23:39:20.7020000' AS DateTime2), 8, 11, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (55, CAST(N'2022-09-03T23:38:54.6730000' AS DateTime2), CAST(N'2022-09-03T23:39:35.1880000' AS DateTime2), 8, 11, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (56, CAST(N'2022-09-03T23:39:53.4330000' AS DateTime2), CAST(N'2022-09-03T23:39:53.4330000' AS DateTime2), 8, 11, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (57, CAST(N'2022-09-03T23:44:58.8910000' AS DateTime2), CAST(N'2022-09-03T23:44:58.8910000' AS DateTime2), 2, 12, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (58, CAST(N'2022-09-03T23:45:05.6030000' AS DateTime2), CAST(N'2022-09-03T23:45:05.6030000' AS DateTime2), 2, 12, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (59, CAST(N'2022-09-03T23:45:11.3140000' AS DateTime2), CAST(N'2022-09-03T23:45:11.3140000' AS DateTime2), 2, 12, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (60, CAST(N'2022-09-03T23:45:30.3100000' AS DateTime2), CAST(N'2022-09-03T23:45:30.3100000' AS DateTime2), 2, 12, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (61, CAST(N'2022-09-03T23:45:36.2690000' AS DateTime2), CAST(N'2022-09-03T23:46:23.3870000' AS DateTime2), 2, 12, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (62, CAST(N'2022-09-03T23:46:36.2390000' AS DateTime2), CAST(N'2022-09-03T23:46:36.2390000' AS DateTime2), 2, 12, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (63, CAST(N'2022-09-03T23:58:17.4720000' AS DateTime2), CAST(N'2022-09-04T00:00:38.2960000' AS DateTime2), 20, 13, 1)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (64, CAST(N'2022-09-03T23:58:26.8040000' AS DateTime2), CAST(N'2022-09-03T23:58:26.8040000' AS DateTime2), 20, 13, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (65, CAST(N'2022-09-03T23:58:33.8910000' AS DateTime2), CAST(N'2022-09-03T23:59:52.1690000' AS DateTime2), 20, 13, 3)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (66, CAST(N'2022-09-03T23:58:41.4530000' AS DateTime2), CAST(N'2022-09-04T00:01:06.5500000' AS DateTime2), 20, 13, 4)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (67, CAST(N'2022-09-03T23:58:51.7710000' AS DateTime2), CAST(N'2022-09-04T00:01:00.0180000' AS DateTime2), 20, 13, 5)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (69, CAST(N'2022-09-03T23:59:06.8190000' AS DateTime2), CAST(N'2022-09-03T23:59:06.8190000' AS DateTime2), 20, 13, 6)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (71, CAST(N'2022-09-09T10:08:40.4690000' AS DateTime2), CAST(N'2022-09-09T10:08:40.4690000' AS DateTime2), 6, 5, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (72, CAST(N'2022-09-09T10:09:44.3710000' AS DateTime2), CAST(N'2022-09-09T10:09:44.3710000' AS DateTime2), 6, 6, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (73, CAST(N'2022-09-09T10:10:10.6030000' AS DateTime2), CAST(N'2022-09-09T10:10:10.6030000' AS DateTime2), 10, 7, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (74, CAST(N'2022-09-09T10:10:42.3450000' AS DateTime2), CAST(N'2022-09-09T10:10:42.3450000' AS DateTime2), 6, 8, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (75, CAST(N'2022-09-09T10:11:09.8470000' AS DateTime2), CAST(N'2022-09-09T10:11:09.8470000' AS DateTime2), 6, 9, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (76, CAST(N'2022-09-09T10:12:19.7980000' AS DateTime2), CAST(N'2022-09-09T10:12:19.7980000' AS DateTime2), 2, 10, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (77, CAST(N'2022-09-09T10:12:40.6630000' AS DateTime2), CAST(N'2022-09-09T10:12:40.6630000' AS DateTime2), 8, 11, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (78, CAST(N'2022-09-09T10:12:58.2690000' AS DateTime2), CAST(N'2022-09-09T10:12:58.2690000' AS DateTime2), 2, 12, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (79, CAST(N'2022-09-09T10:13:19.7080000' AS DateTime2), CAST(N'2022-09-09T10:13:19.7080000' AS DateTime2), 20, 13, 7)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (80, CAST(N'2022-09-09T10:14:52.4270000' AS DateTime2), CAST(N'2022-09-09T10:14:52.4270000' AS DateTime2), 6, 1, 2)
INSERT [dbo].[examination_schedule] ([id], [created_at], [updated_at], [slot], [specialty_id], [examination_day_id]) VALUES (81, CAST(N'2022-09-09T10:15:29.1300000' AS DateTime2), CAST(N'2022-09-09T10:15:29.1300000' AS DateTime2), 8, 3, 2)
SET IDENTITY_INSERT [dbo].[examination_schedule] OFF
GO
SET IDENTITY_INSERT [dbo].[examination_time] ON 

INSERT [dbo].[examination_time] ([id], [created_at], [name], [updated_at]) VALUES (1, CAST(N'2022-08-20T23:21:30.9940000' AS DateTime2), N'8h:30 - 9h:30', CAST(N'2022-08-20T23:21:30.9940000' AS DateTime2))
INSERT [dbo].[examination_time] ([id], [created_at], [name], [updated_at]) VALUES (2, CAST(N'2022-08-20T23:22:19.2540000' AS DateTime2), N'9h:30 - 10h:30', CAST(N'2022-08-20T23:22:19.2540000' AS DateTime2))
INSERT [dbo].[examination_time] ([id], [created_at], [name], [updated_at]) VALUES (4, CAST(N'2022-08-20T23:23:28.4780000' AS DateTime2), N'13h:30 - 14h:30', CAST(N'2022-08-20T23:23:48.2880000' AS DateTime2))
INSERT [dbo].[examination_time] ([id], [created_at], [name], [updated_at]) VALUES (5, CAST(N'2022-08-20T23:23:42.2490000' AS DateTime2), N'14h:30 - 15h:30', CAST(N'2022-08-20T23:23:59.2710000' AS DateTime2))
INSERT [dbo].[examination_time] ([id], [created_at], [name], [updated_at]) VALUES (9, CAST(N'2022-09-14T14:18:24.5290000' AS DateTime2), N'10h:30 - 11h:30', CAST(N'2022-09-14T14:18:24.5290000' AS DateTime2))
INSERT [dbo].[examination_time] ([id], [created_at], [name], [updated_at]) VALUES (13, CAST(N'2022-09-14T20:52:42.9200000' AS DateTime2), N'15h:30 - 16h:30', CAST(N'2022-09-14T20:52:42.9200000' AS DateTime2))
SET IDENTITY_INSERT [dbo].[examination_time] OFF
GO
SET IDENTITY_INSERT [dbo].[role] ON 

INSERT [dbo].[role] ([id], [name]) VALUES (1, N'ROLE_ADMIN')
SET IDENTITY_INSERT [dbo].[role] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_admin] ON 

INSERT [dbo].[tbl_admin] ([id], [address], [avatar], [created_at], [email], [gender], [name], [password], [phone], [updated_at], [user_name]) VALUES (2, N'Ha noi', N'/uploads/admin.jpg', CAST(N'2022-08-21T15:01:19.8530000' AS DateTime2), N'sontre96@gmail.com', 0, N'Mai', N'$2a$10$UZDOZ/gCnx9YNewiGoqsNeSW8yIMtDozaHHwiVO/asbNY7djKSM4S', N'0915096650', CAST(N'2022-09-05T12:12:54.6540000' AS DateTime2), N'Mai123')
INSERT [dbo].[tbl_admin] ([id], [address], [avatar], [created_at], [email], [gender], [name], [password], [phone], [updated_at], [user_name]) VALUES (3, N'Ha Noi', N'/uploads/admin1.jpg', CAST(N'2022-08-23T15:05:52.7150000' AS DateTime2), N'sontre@gmail.com', 1, N'Son', N'$2a$10$Uanar/tXKRbOjnZiXrTMr.V9GB3qNG3LOcMkH882rX38fd9gVoguK', N'0357309651', CAST(N'2022-09-05T12:13:07.8430000' AS DateTime2), N'son123')
INSERT [dbo].[tbl_admin] ([id], [address], [avatar], [created_at], [email], [gender], [name], [password], [phone], [updated_at], [user_name]) VALUES (5, N'Ha Noi', N'/uploads/admin.jpg', CAST(N'2022-09-11T15:59:45.7470000' AS DateTime2), N'hathu0719@gmail.com', 0, N'Can Thi Thu Ha', N'$2a$10$iOAmDgsiHYJ3XWJZLUTCJustrcebhkmnIKaw.gwq3tPiHhYXRUm3y', N'0915096650', CAST(N'2022-09-11T16:00:50.9490000' AS DateTime2), N'thuha0719')
SET IDENTITY_INSERT [dbo].[tbl_admin] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_contact] ON 

INSERT [dbo].[tbl_contact] ([id], [created_at], [email], [name], [note], [phone], [updated_at], [contact_status]) VALUES (1, CAST(N'2022-08-19T14:41:41.8420000' AS DateTime2), N'sontre96@gmail.com', N'Nguyen Hoang Son', N'Good', N'0357309651', CAST(N'2022-09-13T21:57:29.4420000' AS DateTime2), 1)
INSERT [dbo].[tbl_contact] ([id], [created_at], [email], [name], [note], [phone], [updated_at], [contact_status]) VALUES (5, CAST(N'2022-09-11T00:27:41.2640000' AS DateTime2), N'dainhan@gmail.com', N'Nguyen Dai Nhan', N'ssssssssssssssssss', N'0435756124', CAST(N'2022-09-13T21:57:25.5310000' AS DateTime2), 1)
INSERT [dbo].[tbl_contact] ([id], [created_at], [email], [name], [note], [phone], [updated_at], [contact_status]) VALUES (6, CAST(N'2022-09-13T22:01:15.3540000' AS DateTime2), N'han@gmail.com', N'Tran Di Han', N'good', N'0942573651', CAST(N'2022-09-13T22:01:44.7320000' AS DateTime2), 1)
SET IDENTITY_INSERT [dbo].[tbl_contact] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_doctor] ON 

INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (1, N'Ha Noi', N'/uploads/nguyenviettienCTCH.png', NULL, 1, N'Nguyen Viet Tien', N'0915074301', 1, CAST(N'2022-09-05T10:48:11.7550000' AS DateTime2), 1)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (2, N'Ha Noi', N'/uploads/trananhvuCTCH.png', CAST(N'2022-08-21T13:43:18.7740000' AS DateTime2), 1, N'Tran Anh Vu', N'0912074302', 1, CAST(N'2022-09-05T10:49:10.6140000' AS DateTime2), 1)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (4, N'Ha Noi', N'/uploads/TranThiThanhTuCTCH.png', CAST(N'2022-09-03T22:10:29.6920000' AS DateTime2), 0, N'Tran Thi Thanh Tu', N'0147854123', 1, CAST(N'2022-09-05T10:49:27.0070000' AS DateTime2), 1)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (5, N'Ha Noi', N'/uploads/HuynhNgocLongKTM.png', CAST(N'2022-09-03T22:24:05.6550000' AS DateTime2), 1, N'Huynh Ngoc Long', N'0147541369', 1, CAST(N'2022-09-05T10:52:19.5020000' AS DateTime2), 3)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (6, N'Ha Nam', N'/uploads/PhamNguyenVinhKTM.png', CAST(N'2022-09-03T22:26:34.7130000' AS DateTime2), 1, N'Pham Nguyen Vinh', N'0472103516', 1, CAST(N'2022-09-05T10:52:33.3840000' AS DateTime2), 3)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (7, N'Hai phong', N'/uploads/NguyenThiBachYenKTM.png', CAST(N'2022-09-03T22:28:19.3830000' AS DateTime2), 0, N'Nguyen Thi Bach Yen', N'0143687426', 0, CAST(N'2022-09-05T10:52:59.6650000' AS DateTime2), 3)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (8, N'Ha Noi', N'/uploads/NguyenQuocKhanhKTM.png', CAST(N'2022-09-03T22:30:09.5080000' AS DateTime2), 1, N'Nguyen Quoc Khanh', N'0357641284', 1, CAST(N'2022-09-05T10:53:15.4720000' AS DateTime2), 3)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (9, N'Ha Noi', N'/uploads/DuongThuyNgaKNHI.png', CAST(N'2022-09-03T22:35:29.7740000' AS DateTime2), 0, N'Duong Thuy Nga', N'0147254862', 1, CAST(N'2022-09-05T10:54:46.4200000' AS DateTime2), 5)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (10, N'Ha Noi', N'/uploads/BuiThiKhuyenKNHI.jpg', CAST(N'2022-09-03T22:41:34.6610000' AS DateTime2), 0, N'Bui Thi Khuyen', N'0145357426', 1, CAST(N'2022-09-05T10:54:55.1170000' AS DateTime2), 5)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (11, N'Ha Noi', N'/uploads/NguyenThiHanhTrangKNHI.png', CAST(N'2022-09-03T22:42:49.7020000' AS DateTime2), 0, N'Nguyen Thi Hanh Trang', N'0357412684', 1, CAST(N'2022-09-05T10:55:10.6940000' AS DateTime2), 5)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (12, N'Ha Noi', N'/uploads/MacLanHuongTTXN.png', CAST(N'2022-09-03T22:49:56.6220000' AS DateTime2), 0, N'Mac Lan Huong', N'0124753698', 1, CAST(N'2022-09-05T10:59:12.1840000' AS DateTime2), 6)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (13, N'Hai Duong', N'/uploads/NguyenQuocDungTTXN.png', CAST(N'2022-09-03T22:51:02.5830000' AS DateTime2), 1, N'Nguyen Quoc Dung', N'0146742593', 1, CAST(N'2022-09-05T10:59:27.4890000' AS DateTime2), 6)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (14, N'Ha Nam', N'/uploads/TranThiThanhNgaTTXN.png', CAST(N'2022-09-03T22:52:27.2690000' AS DateTime2), 0, N'Tran Thi Thanh Nga', N'0147512349', 1, CAST(N'2022-09-05T10:59:45.6470000' AS DateTime2), 6)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (15, N'Ha Noi', N'/uploads/NguyenVanLieuTTTK.png', CAST(N'2022-09-03T23:02:40.0340000' AS DateTime2), 1, N'Nguyen Van Lieu', N'0475213684', 1, CAST(N'2022-09-05T11:06:26.3120000' AS DateTime2), 7)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (16, N'Ha Noi', N'/uploads/NguyenThiMinhDucTTTK.png', CAST(N'2022-09-03T23:03:05.4230000' AS DateTime2), 0, N'Nguyen Thi Minh Duc', N'0143675521', 1, CAST(N'2022-09-05T11:06:41.2850000' AS DateTime2), 7)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (17, N'Ha Noi', N'/uploads/LeVanTuanTTTK.png', CAST(N'2022-09-03T23:04:00.0000000' AS DateTime2), 1, N'Le Van Tuan', N'0168753249', 1, CAST(N'2022-09-05T11:07:17.2390000' AS DateTime2), 7)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (18, N'Ha Noi', N'/uploads/NguyenThiHaiYenTTTK.png', CAST(N'2022-09-03T23:05:03.1040000' AS DateTime2), 0, N'Nguyen Thi Hai Yen', N'0915067325', 1, CAST(N'2022-09-05T11:07:35.1560000' AS DateTime2), 7)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (19, N'Ha Noi', N'/uploads/NguyenDuyHienTTTK.png', CAST(N'2022-09-03T23:06:12.7100000' AS DateTime2), 1, N'Nguyen Duy Hien', N'0135764125', 1, CAST(N'2022-09-05T11:03:37.5940000' AS DateTime2), 7)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (20, N'Ha Noi', N'/uploads/NguyenThuyLinhKTMH.png', CAST(N'2022-09-03T23:11:05.8230000' AS DateTime2), 0, N'Nguyen Thuy Linh', N'0134765421', 1, CAST(N'2022-09-05T11:17:18.6590000' AS DateTime2), 8)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (21, N'Ha Noi', N'/uploads/LeMinhKyKTMH.png', CAST(N'2022-09-03T23:11:58.1610000' AS DateTime2), 1, N'Le Minh Ky', N'0349651247', 1, CAST(N'2022-09-05T11:17:32.5250000' AS DateTime2), 8)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (22, N'Ha Noi', N'/uploads/TranThiThuyHangKTMH.png', CAST(N'2022-09-03T23:13:08.0600000' AS DateTime2), 0, N'Tran Thi Thuy Hang', N'0347310684', 1, CAST(N'2022-09-05T11:17:49.3020000' AS DateTime2), 8)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (23, N'Ha Noi', N'/uploads/NgoQuyChauKNHH.png', CAST(N'2022-09-03T23:22:52.4730000' AS DateTime2), 1, N'Ngo Quy Chau', N'0142357841', 1, CAST(N'2022-09-05T11:25:50.8110000' AS DateTime2), 9)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (24, N'Ha Noi', N'/uploads/DangThanhDoKNHH.png', CAST(N'2022-09-03T23:23:37.0520000' AS DateTime2), 1, N'Dang Thanh Do', N'0168742649', 1, CAST(N'2022-09-05T11:26:03.5450000' AS DateTime2), 9)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (25, N'Ha Noi', N'/uploads/LaQuyHuongKNHH.png', CAST(N'2022-09-03T23:24:08.3510000' AS DateTime2), 0, N'La Quy Huong', N'0463171842', 1, CAST(N'2022-09-05T11:26:15.8090000' AS DateTime2), 9)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (26, N'Ha Noi', N'/uploads/TranDangTrinhKDuoc.png', CAST(N'2022-09-03T23:30:07.8960000' AS DateTime2), 1, N'Tran Dang Trinh', N'0367210540', 0, CAST(N'2022-09-05T11:27:23.5950000' AS DateTime2), 10)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (27, N'Ha Noi', N'/uploads/HoangTrongTinKDuoc.png', CAST(N'2022-09-03T23:30:40.1270000' AS DateTime2), 1, N'HoangTrong Tin', N'0386142875', 1, CAST(N'2022-09-05T11:27:34.1260000' AS DateTime2), 10)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (28, N'Ha Noi', N'/uploads/NguyenDucNhuanKKB.png', CAST(N'2022-09-03T23:34:25.3610000' AS DateTime2), 1, N'Nguyen Duc Nhuan', N'0732146826', 1, CAST(N'2022-09-05T11:29:55.9560000' AS DateTime2), 11)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (29, N'Ha Noi', N'/uploads/QuachNganHaKKB.png', CAST(N'2022-09-03T23:34:55.8800000' AS DateTime2), 0, N'Quach Ngan Ha', N'0548369841', 1, CAST(N'2022-09-05T11:30:16.0090000' AS DateTime2), 11)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (30, N'Ha Noi', N'/uploads/NguyenMinhTuanKKB.png', CAST(N'2022-09-03T23:36:44.5780000' AS DateTime2), 1, N'Nguyen Minh Tuan', N'0468751240', 1, CAST(N'2022-09-05T11:30:55.3400000' AS DateTime2), 11)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (31, N'Ha Noi', N'/uploads/HuynhThiPhuongDungKKB.png', CAST(N'2022-09-03T23:37:22.3650000' AS DateTime2), 0, N'Huynh Thi Phuong Dung', N'0357410268', 1, CAST(N'2022-09-05T11:31:09.7750000' AS DateTime2), 11)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (32, N'Ha Noi', N'/uploads/NguyenNgocQuynhHTSS.png', CAST(N'2022-09-03T23:44:03.4610000' AS DateTime2), 0, N'Nguyen Ngoc Quynh', N'0134750970', 1, CAST(N'2022-09-05T12:05:31.7490000' AS DateTime2), 12)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (33, N'Ha Noi', N'/uploads/NguyenLeThuyHTSS.png', CAST(N'2022-09-03T23:44:30.0780000' AS DateTime2), 0, N'Nguyen Le Thuy', N'0350096512', 1, CAST(N'2022-09-05T12:05:49.2350000' AS DateTime2), 12)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (34, N'Ha Noi', N'/uploads/PhanThiXuanTTTC.png', CAST(N'2022-09-03T23:51:09.1640000' AS DateTime2), 0, N'Phan Thi Xuan', N'0378426910', 1, CAST(N'2022-09-05T12:09:25.9100000' AS DateTime2), 13)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (35, N'Ha Noi', N'/uploads/LeThiDiemTuyetTTTC.png', CAST(N'2022-09-03T23:52:10.2570000' AS DateTime2), 0, N'Le Thi Diem Tuyet', N'0394126710', 1, CAST(N'2022-09-05T12:09:14.1490000' AS DateTime2), 13)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (36, N'Ha Noi', N'/uploads/NguyenNgocNhaKhanhTTTC.png', CAST(N'2022-09-03T23:53:58.1240000' AS DateTime2), 0, N'Nguyen Ngoc Nha Khanh', N'0432987219', 1, CAST(N'2022-09-05T12:08:58.3080000' AS DateTime2), 13)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (37, N'Ha Noi', N'/uploads/LeThiMinhThiTTTC.png', CAST(N'2022-09-03T23:54:57.8490000' AS DateTime2), 0, N'Le Thi Minh Thi', N'0173542984', 1, CAST(N'2022-09-05T12:08:43.0800000' AS DateTime2), 13)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (38, N'Ha Noi', N'/uploads/NguyenThiNgaNCKH.png', CAST(N'2022-09-03T23:56:43.0850000' AS DateTime2), 0, N'Nguyen Thi Nga', N'0432186427', 1, CAST(N'2022-09-05T12:06:38.4650000' AS DateTime2), 14)
INSERT [dbo].[tbl_doctor] ([id], [address], [avatar], [created_at], [gender], [name], [phone], [status], [updated_at], [specialty_id]) VALUES (39, N'Ha Noi', N'/uploads/LeNgocAnhNCKH.png', CAST(N'2022-09-03T23:57:12.5990000' AS DateTime2), 0, N'Le Ngoc Anh', N'0436743250', 1, CAST(N'2022-09-05T12:07:17.2060000' AS DateTime2), 14)
SET IDENTITY_INSERT [dbo].[tbl_doctor] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_specialty] ON 

INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (1, CAST(N'2022-08-19T22:44:11.0310000' AS DateTime2), N'Khoa Chan Thuong Chinh Hinh', N'Orthopedic Department', CAST(N'2022-09-14T08:58:09.4700000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (3, CAST(N'2022-08-20T23:24:35.3640000' AS DateTime2), N'Khoa Tim Mach', N'Cardiology Department', CAST(N'2022-09-14T08:58:42.1620000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (5, CAST(N'2022-08-31T09:03:00.0180000' AS DateTime2), N'Khoa Nhi', N'Pediatrics Department', CAST(N'2022-09-14T08:58:48.3930000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (6, CAST(N'2022-08-31T09:04:27.5140000' AS DateTime2), N'Trung Tam Xet Nghiem', N'Testing Center', CAST(N'2022-09-14T08:59:12.7130000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (7, CAST(N'2022-08-31T09:05:38.2300000' AS DateTime2), N'Khoa Trung Tam Than kinh', N'Department of central nervous system', CAST(N'2022-09-14T09:13:07.6210000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (8, CAST(N'2022-08-31T09:06:15.5870000' AS DateTime2), N'Khoa Tai Mui Hong', N'Otorhinolaryngology', CAST(N'2022-09-14T09:13:27.9500000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (9, CAST(N'2022-08-31T09:06:51.2090000' AS DateTime2), N'Khoa Ho Hap', N'Respiratory Medicine', CAST(N'2022-09-14T09:14:09.1500000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (10, CAST(N'2022-08-31T09:07:25.4390000' AS DateTime2), N'Khoa Duoc', N'Pharmacy Department', CAST(N'2022-09-14T09:14:39.0270000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (11, CAST(N'2022-08-31T09:07:54.8580000' AS DateTime2), N'Khoa Kham Benh', N'Medical Examination Department', CAST(N'2022-09-14T09:15:00.5720000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (12, CAST(N'2022-08-31T09:08:16.5300000' AS DateTime2), N'Trung Tam Ho Tro Sinh San', N'Fertility Center', CAST(N'2022-09-14T09:15:23.5080000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (13, CAST(N'2022-08-31T09:09:39.4290000' AS DateTime2), N'Trung Tam Tiem Chung', N'Vaccination Center', CAST(N'2022-09-14T09:15:51.1600000' AS DateTime2))
INSERT [dbo].[tbl_specialty] ([id], [created_at], [description], [name], [updated_at]) VALUES (14, CAST(N'2022-08-31T09:09:48.0990000' AS DateTime2), N'Trung Tam Nghien Cuu Va Dao Tao', N'Training and Research Center', CAST(N'2022-09-14T09:16:24.1130000' AS DateTime2))
SET IDENTITY_INSERT [dbo].[tbl_specialty] OFF
GO
ALTER TABLE [dbo].[admins_roles]  WITH CHECK ADD  CONSTRAINT [FKj7xrxh80ybsoocjwdeb4xv51h] FOREIGN KEY([admin_id])
REFERENCES [dbo].[tbl_admin] ([id])
GO
ALTER TABLE [dbo].[admins_roles] CHECK CONSTRAINT [FKj7xrxh80ybsoocjwdeb4xv51h]
GO
ALTER TABLE [dbo].[admins_roles]  WITH CHECK ADD  CONSTRAINT [FKlgn5xtde3ysro9ydng18ym1yi] FOREIGN KEY([role_id])
REFERENCES [dbo].[role] ([id])
GO
ALTER TABLE [dbo].[admins_roles] CHECK CONSTRAINT [FKlgn5xtde3ysro9ydng18ym1yi]
GO
ALTER TABLE [dbo].[appointment_schedule]  WITH CHECK ADD  CONSTRAINT [FK8gkh7kdifchbi8n2a097jnduj] FOREIGN KEY([examination_price_id])
REFERENCES [dbo].[examination_price] ([id])
GO
ALTER TABLE [dbo].[appointment_schedule] CHECK CONSTRAINT [FK8gkh7kdifchbi8n2a097jnduj]
GO
ALTER TABLE [dbo].[appointment_schedule]  WITH CHECK ADD  CONSTRAINT [FKfc8s0nlm5y2glskewljvmpv8b] FOREIGN KEY([examination_time_id])
REFERENCES [dbo].[examination_time] ([id])
GO
ALTER TABLE [dbo].[appointment_schedule] CHECK CONSTRAINT [FKfc8s0nlm5y2glskewljvmpv8b]
GO
ALTER TABLE [dbo].[appointment_schedule]  WITH CHECK ADD  CONSTRAINT [FKssuqhw7983rrcv3r40ovfl2j8] FOREIGN KEY([specialty_id])
REFERENCES [dbo].[tbl_specialty] ([id])
GO
ALTER TABLE [dbo].[appointment_schedule] CHECK CONSTRAINT [FKssuqhw7983rrcv3r40ovfl2j8]
GO
ALTER TABLE [dbo].[examination_schedule]  WITH CHECK ADD  CONSTRAINT [FK4icjjh2poh1vl30ncltrw76aa] FOREIGN KEY([examination_day_id])
REFERENCES [dbo].[examination_day] ([id])
GO
ALTER TABLE [dbo].[examination_schedule] CHECK CONSTRAINT [FK4icjjh2poh1vl30ncltrw76aa]
GO
ALTER TABLE [dbo].[examination_schedule]  WITH CHECK ADD  CONSTRAINT [FKgas3u4b04n7mmq2pt2xrx45cp] FOREIGN KEY([specialty_id])
REFERENCES [dbo].[tbl_specialty] ([id])
GO
ALTER TABLE [dbo].[examination_schedule] CHECK CONSTRAINT [FKgas3u4b04n7mmq2pt2xrx45cp]
GO
ALTER TABLE [dbo].[tbl_doctor]  WITH CHECK ADD  CONSTRAINT [FKj0x09lgfjgynkrihj76e1cnkp] FOREIGN KEY([specialty_id])
REFERENCES [dbo].[tbl_specialty] ([id])
GO
ALTER TABLE [dbo].[tbl_doctor] CHECK CONSTRAINT [FKj0x09lgfjgynkrihj76e1cnkp]
GO
