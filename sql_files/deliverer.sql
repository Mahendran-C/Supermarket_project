USE [Supermarket]
GO

/****** Object:  Table [dbo].[Deliverer]    Script Date: 8/1/2020 12:25:15 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Deliverer]') AND type in (N'U'))
DROP TABLE [dbo].[Deliverer]
GO

/****** Object:  Table [dbo].[Deliverer]    Script Date: 8/1/2020 12:25:15 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[deliverer](
	[deliverer_Id] [int] identity(1,1)NOT NULL,
	[name] [varchar](30) NOT NULL,
	[contactNo] [varchar](15) NOT NULL,
	[vechileNo] [varchar](10) NULL,
	[licenseNo] [varchar](25) NOT NULL,
	[customer_Id] [int] NOT NULL,
	[order_Id] [int] NOT NULL,
	[createdat] [varchar] (50) NULL,
 CONSTRAINT [PK_Deliverer] PRIMARY KEY CLUSTERED 
(
	[Deliverer_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


